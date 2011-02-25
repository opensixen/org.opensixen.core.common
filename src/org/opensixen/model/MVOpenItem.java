package org.opensixen.model;

import java.sql.ResultSet;
import java.util.List;
import java.util.Properties;

public class MVOpenItem extends X_RV_OpenItem {

	public MVOpenItem(Properties ctx, int RV_OpenItem_ID, String trxName) {
		super(ctx, RV_OpenItem_ID, trxName);
	}

	public MVOpenItem(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

	/**
	 * Get OpenItems for this invoice
	 * @param ctx
	 * @param C_Invoice_ID
	 * @return
	 */
	public static List<MVOpenItem> getFromInvoice(Properties ctx, int C_Invoice_ID)	{
		String[] order = { COLUMNNAME_DueDate };
		QParam[] params = { new QParam(COLUMNNAME_C_Invoice_ID, C_Invoice_ID) };
		List<MVOpenItem> items = POFactory.getList(ctx, MVOpenItem.class, params,order, null);
		return items;
	}
	
	/**
	 * Get OpenItems for this invoice
	 * @param ctx
	 * @param C_Invoice_ID
	 * @return
	 */
	public static List<MVOpenItem> getFromOrder(Properties ctx, int C_Order_ID)	{
		String[] order = { COLUMNNAME_DueDate };
		QParam[] params = { new QParam(COLUMNNAME_C_Order_ID, C_Order_ID) };
		List<MVOpenItem> items = POFactory.getList(ctx, MVOpenItem.class, params,order, null);
		return items;
	}
	
}
