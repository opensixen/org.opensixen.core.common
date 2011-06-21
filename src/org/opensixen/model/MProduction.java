package org.opensixen.model;

import java.sql.ResultSet;
import java.util.Properties;


import org.compiere.model.X_M_Production;

public class MProduction extends X_M_Production {

	private static final long serialVersionUID = 1L;

	public MProduction(Properties ctx, int M_Production_ID, String trxName) {
		super(ctx, M_Production_ID, trxName);
	}

	public MProduction(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}
	
	public static MProduction copyFrom(Properties ctx, MProduction from, String trxName)	{
		MProduction production = new MProduction(ctx,0 , trxName);
		// Copy and setup new values
		copyValues(from, production, from.getAD_Client_ID(), from.getAD_Org_ID());			
		return production;

	}

}
