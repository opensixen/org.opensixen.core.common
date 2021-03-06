package org.opensixen.model;

import java.sql.Timestamp;
import java.util.List;
import java.util.Properties;

import org.adempiere.exceptions.TaxCriteriaNotFoundException;
import org.compiere.model.I_C_BPartner;
import org.compiere.model.MBPartnerLocation;
import org.compiere.model.MCharge;
import org.compiere.model.MProduct;
import org.opensixen.exceptions.TaxCriteriaNotImplemented;
import org.opensixen.osgi.interfaces.ITaxFactory;

public class TaxFactory implements ITaxFactory {

	@Override
	public int get(Properties ctx, int M_Product_ID, int C_Charge_ID,
			Timestamp billDate, Timestamp shipDate, int AD_Org_ID,
			int M_Warehouse_ID, int billC_BPartner_Location_ID,
			int shipC_BPartner_Location_ID, boolean IsSOTrx)
			throws TaxCriteriaNotFoundException {

		MBPartnerLocation bill_location = POFactory.get(MBPartnerLocation.class, new QParam(MBPartnerLocation.COLUMNNAME_C_BPartner_Location_ID, billC_BPartner_Location_ID));
		I_C_BPartner bp = bill_location.getC_BPartner();

		//	Only manage bp with tax group
		if (bp.getC_TaxGroup_ID() == 0)	{
			throw new TaxCriteriaNotImplemented("This factory can't manage this tax. Delegate to standard Tax factory");
		}

		// Get all tax definitions.		
		List<MTaxDefinition> definitions = POFactory.getList(ctx, MTaxDefinition.class, new QParam(MTaxDefinition.COLUMNNAME_C_TaxGroup_ID, bp.getC_TaxGroup_ID()));
		if (definitions.size() == 1)	{
			return definitions.get(0).getC_Tax_ID();
		}
		
		int C_TaxCategory_ID = 0;

		// Select C_TaxCategory_ID from product or charge
		if (M_Product_ID != 0)	{
			MProduct product = MProduct.get(ctx, M_Product_ID);
			C_TaxCategory_ID = product.getC_TaxCategory_ID();
		}
		else {
			MCharge charge = MCharge.get(ctx, C_Charge_ID);
			C_TaxCategory_ID = charge.getC_TaxCategory_ID();
		}

		
		// Try to find tax definition with the same tax category
		for (MTaxDefinition definition:definitions)	{
			if (definition.getC_TaxCategory_ID() == C_TaxCategory_ID)	{
				return definition.getC_Tax_ID();
			}
		}
		
		throw new TaxCriteriaNotFoundException("Tax criteria not found", 0);
	}

}
