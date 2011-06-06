package org.opensixen.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.eevolution.model.X_C_TaxDefinition;

public class MTaxDefinition extends X_C_TaxDefinition{

	public MTaxDefinition(Properties ctx, int C_TaxDefinition_ID, String trxName) {
		super(ctx, C_TaxDefinition_ID, trxName);
	}

	public MTaxDefinition(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}
			
}
