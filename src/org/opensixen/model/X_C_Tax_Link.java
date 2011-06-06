/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.opensixen.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for C_Tax_Link
 *  @author Adempiere (generated) 
 *  @version Release 3.6.0LTS - $Id$ */
public class X_C_Tax_Link extends PO implements I_C_Tax_Link, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20110606L;

    /** Standard Constructor */
    public X_C_Tax_Link (Properties ctx, int C_Tax_Link_ID, String trxName)
    {
      super (ctx, C_Tax_Link_ID, trxName);
      /** if (C_Tax_Link_ID == 0)
        {
			setC_Tax_ID (0);
			setC_Tax_Link_ID (0);
			setLinked_Tax_ID (0);
        } */
    }

    /** Load Constructor */
    public X_C_Tax_Link (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_C_Tax_Link[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_C_Tax getC_Tax() throws RuntimeException
    {
		return (org.compiere.model.I_C_Tax)MTable.get(getCtx(), org.compiere.model.I_C_Tax.Table_Name)
			.getPO(getC_Tax_ID(), get_TrxName());	}

	/** Set Tax.
		@param C_Tax_ID 
		Tax identifier
	  */
	public void setC_Tax_ID (int C_Tax_ID)
	{
		if (C_Tax_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_Tax_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_Tax_ID, Integer.valueOf(C_Tax_ID));
	}

	/** Get Tax.
		@return Tax identifier
	  */
	public int getC_Tax_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Tax_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Tax Link.
		@param C_Tax_Link_ID Tax Link	  */
	public void setC_Tax_Link_ID (int C_Tax_Link_ID)
	{
		if (C_Tax_Link_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_Tax_Link_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_Tax_Link_ID, Integer.valueOf(C_Tax_Link_ID));
	}

	/** Get Tax Link.
		@return Tax Link	  */
	public int getC_Tax_Link_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Tax_Link_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_Tax getLinked_Tax() throws RuntimeException
    {
		return (org.compiere.model.I_C_Tax)MTable.get(getCtx(), org.compiere.model.I_C_Tax.Table_Name)
			.getPO(getLinked_Tax_ID(), get_TrxName());	}

	/** Set Linked Tax.
		@param Linked_Tax_ID Linked Tax	  */
	public void setLinked_Tax_ID (int Linked_Tax_ID)
	{
		if (Linked_Tax_ID < 1) 
			set_Value (COLUMNNAME_Linked_Tax_ID, null);
		else 
			set_Value (COLUMNNAME_Linked_Tax_ID, Integer.valueOf(Linked_Tax_ID));
	}

	/** Get Linked Tax.
		@return Linked Tax	  */
	public int getLinked_Tax_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Linked_Tax_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}