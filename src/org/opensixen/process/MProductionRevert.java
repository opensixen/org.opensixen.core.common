package org.opensixen.process;

import java.util.List;

import org.compiere.model.PO;
import org.compiere.model.X_M_Production;
import org.compiere.model.X_M_ProductionLine;
import org.compiere.model.X_M_ProductionPlan;
import org.compiere.process.M_Production_Run;
import org.compiere.process.SvrProcess;
import org.compiere.util.Trx;
import org.opensixen.model.POFactory;
import org.opensixen.model.QParam;

public class MProductionRevert extends SvrProcess {

	/** The Record */
	private int p_Record_ID = 0;
	
	
	@Override
	protected void prepare() {
		p_Record_ID = getRecord_ID();
		
	}

	@Override
	protected String doIt() throws Exception {		
		
		// Production header
		X_M_Production c_production = new X_M_Production(getCtx(), p_Record_ID, get_TrxName());
		X_M_Production n_production = new X_M_Production(getCtx(),0 , get_TrxName());		
		PO.copyValues(c_production, n_production);
		
		n_production.setDescription("void ->" +c_production.getDescription());	
		// Unprocessed
		n_production.setProcessed(false);
		n_production.save();
		
		c_production.setDescription( c_production.getDescription() + " -> voided ");
		c_production.set_ValueOfColumn("IsReverted", "Y");
		c_production.save();

		
		// Production Plan
		X_M_ProductionPlan c_plan = POFactory.get(X_M_ProductionPlan.class, new QParam(c_production.COLUMNNAME_M_Production_ID, c_production.getM_Production_ID()));
		X_M_ProductionPlan n_plan = new X_M_ProductionPlan(getCtx(), 0, get_TrxName());
		PO.copyValues(c_plan,n_plan);
		// new M_Production_ID
		n_plan.setM_Production_ID(n_production.getM_Production_ID());
		// Negate qty
		n_plan.setProductionQty(c_plan.getProductionQty().negate());
		n_plan.save();
		
		
		// Lines
		List<X_M_ProductionLine> lines = POFactory.getList(getCtx(), X_M_ProductionLine.class, new QParam(c_plan.COLUMNNAME_M_ProductionPlan_ID, c_plan.getM_ProductionPlan_ID()));
		for (X_M_ProductionLine line:lines)	{
			X_M_ProductionLine newLine = new X_M_ProductionLine(getCtx(), 0, get_TrxName());
			PO.copyValues(line, newLine);
			newLine.setM_ProductionPlan_ID(n_plan.getM_ProductionPlan_ID());
			newLine.setMovementQty(line.getMovementQty().negate());
			newLine.save();
		}
		
		return null;
	}

}
