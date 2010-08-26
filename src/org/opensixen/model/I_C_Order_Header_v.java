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
package org.opensixen.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for C_Order_Header_v
 *  @author Adempiere (generated) 
 *  @version Release 3.6.0LTS
 */
public interface I_C_Order_Header_v 
{

    /** TableName=C_Order_Header_v */
    public static final String Table_Name = "C_Order_Header_v";

    /** AD_Table_ID=496 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 1 - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Language */
    public static final String COLUMNNAME_AD_Language = "AD_Language";

	/** Set Language.
	  * Language for this entity
	  */
	public void setAD_Language (String AD_Language);

	/** Get Language.
	  * Language for this entity
	  */
	public String getAD_Language();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name AmtInWords */
    public static final String COLUMNNAME_AmtInWords = "AmtInWords";

	/** Set Amt in Words.
	  * Amount in words
	  */
	public void setAmtInWords (BigDecimal AmtInWords);

	/** Get Amt in Words.
	  * Amount in words
	  */
	public BigDecimal getAmtInWords();

    /** Column name Bill_BPartner_ID */
    public static final String COLUMNNAME_Bill_BPartner_ID = "Bill_BPartner_ID";

	/** Set Invoice Partner.
	  * Business Partner to be invoiced
	  */
	public void setBill_BPartner_ID (int Bill_BPartner_ID);

	/** Get Invoice Partner.
	  * Business Partner to be invoiced
	  */
	public int getBill_BPartner_ID();

	public org.compiere.model.I_C_BPartner getBill_BPartner() throws RuntimeException;

    /** Column name Bill_BPTaxID */
    public static final String COLUMNNAME_Bill_BPTaxID = "Bill_BPTaxID";

	/** Set Invoice Tax ID	  */
	public void setBill_BPTaxID (String Bill_BPTaxID);

	/** Get Invoice Tax ID	  */
	public String getBill_BPTaxID();

    /** Column name Bill_BPValue */
    public static final String COLUMNNAME_Bill_BPValue = "Bill_BPValue";

	/** Set Invoice Partner Key	  */
	public void setBill_BPValue (String Bill_BPValue);

	/** Get Invoice Partner Key	  */
	public String getBill_BPValue();

    /** Column name Bill_C_Location_ID */
    public static final String COLUMNNAME_Bill_C_Location_ID = "Bill_C_Location_ID";

	/** Set Invoice Address.
	  * Address Used for Invoicing
	  */
	public void setBill_C_Location_ID (int Bill_C_Location_ID);

	/** Get Invoice Address.
	  * Address Used for Invoicing
	  */
	public int getBill_C_Location_ID();

	public I_C_Location getBill_C_Location() throws RuntimeException;

    /** Column name Bill_ContactName */
    public static final String COLUMNNAME_Bill_ContactName = "Bill_ContactName";

	/** Set Invoice Contact Name	  */
	public void setBill_ContactName (String Bill_ContactName);

	/** Get Invoice Contact Name	  */
	public String getBill_ContactName();

    /** Column name Bill_Location_ID */
    public static final String COLUMNNAME_Bill_Location_ID = "Bill_Location_ID";

	/** Set Invoice Location.
	  * Business Partner Location for invoicing
	  */
	public void setBill_Location_ID (int Bill_Location_ID);

	/** Get Invoice Location.
	  * Business Partner Location for invoicing
	  */
	public int getBill_Location_ID();

	public org.compiere.model.I_C_BPartner_Location getBill_Location() throws RuntimeException;

    /** Column name Bill_Name */
    public static final String COLUMNNAME_Bill_Name = "Bill_Name";

	/** Set Invoice Name	  */
	public void setBill_Name (String Bill_Name);

	/** Get Invoice Name	  */
	public String getBill_Name();

    /** Column name Bill_Name2 */
    public static final String COLUMNNAME_Bill_Name2 = "Bill_Name2";

	/** Set Invoice Name2	  */
	public void setBill_Name2 (String Bill_Name2);

	/** Get Invoice Name2	  */
	public String getBill_Name2();

    /** Column name Bill_Phone */
    public static final String COLUMNNAME_Bill_Phone = "Bill_Phone";

	/** Set Invoice Phone	  */
	public void setBill_Phone (String Bill_Phone);

	/** Get Invoice Phone	  */
	public String getBill_Phone();

    /** Column name Bill_Title */
    public static final String COLUMNNAME_Bill_Title = "Bill_Title";

	/** Set Invoice Title	  */
	public void setBill_Title (String Bill_Title);

	/** Get Invoice Title	  */
	public String getBill_Title();

    /** Column name Bill_User_ID */
    public static final String COLUMNNAME_Bill_User_ID = "Bill_User_ID";

	/** Set Invoice Contact.
	  * Business Partner Contact for invoicing
	  */
	public void setBill_User_ID (int Bill_User_ID);

	/** Get Invoice Contact.
	  * Business Partner Contact for invoicing
	  */
	public int getBill_User_ID();

	public org.compiere.model.I_AD_User getBill_User() throws RuntimeException;

    /** Column name BPContactGreeting */
    public static final String COLUMNNAME_BPContactGreeting = "BPContactGreeting";

	/** Set BP Contact Greeting.
	  * Greeting for Business Partner Contact
	  */
	public void setBPContactGreeting (String BPContactGreeting);

	/** Get BP Contact Greeting.
	  * Greeting for Business Partner Contact
	  */
	public String getBPContactGreeting();

    /** Column name BPGreeting */
    public static final String COLUMNNAME_BPGreeting = "BPGreeting";

	/** Set BP Greeting.
	  * Greeting for Business Partner
	  */
	public void setBPGreeting (String BPGreeting);

	/** Get BP Greeting.
	  * Greeting for Business Partner
	  */
	public String getBPGreeting();

    /** Column name BPTaxID */
    public static final String COLUMNNAME_BPTaxID = "BPTaxID";

	/** Set Partner Tax ID.
	  * Tax ID of the Business Partner
	  */
	public void setBPTaxID (String BPTaxID);

	/** Get Partner Tax ID.
	  * Tax ID of the Business Partner
	  */
	public String getBPTaxID();

    /** Column name BPValue */
    public static final String COLUMNNAME_BPValue = "BPValue";

	/** Set BP Search Key.
	  * Business Partner Key Value
	  */
	public void setBPValue (String BPValue);

	/** Get BP Search Key.
	  * Business Partner Key Value
	  */
	public String getBPValue();

    /** Column name C_Activity_ID */
    public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";

	/** Set Activity.
	  * Business Activity
	  */
	public void setC_Activity_ID (int C_Activity_ID);

	/** Get Activity.
	  * Business Activity
	  */
	public int getC_Activity_ID();

	public org.compiere.model.I_C_Activity getC_Activity() throws RuntimeException;

    /** Column name C_BPartner_ID */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

	/** Set Business Partner .
	  * Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID);

	/** Get Business Partner .
	  * Identifies a Business Partner
	  */
	public int getC_BPartner_ID();

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException;

    /** Column name C_Campaign_ID */
    public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";

	/** Set Campaign.
	  * Marketing Campaign
	  */
	public void setC_Campaign_ID (int C_Campaign_ID);

	/** Get Campaign.
	  * Marketing Campaign
	  */
	public int getC_Campaign_ID();

	public org.compiere.model.I_C_Campaign getC_Campaign() throws RuntimeException;

    /** Column name C_Charge_ID */
    public static final String COLUMNNAME_C_Charge_ID = "C_Charge_ID";

	/** Set Charge.
	  * Additional document charges
	  */
	public void setC_Charge_ID (int C_Charge_ID);

	/** Get Charge.
	  * Additional document charges
	  */
	public int getC_Charge_ID();

	public org.compiere.model.I_C_Charge getC_Charge() throws RuntimeException;

    /** Column name C_Currency_ID */
    public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";

	/** Set Currency.
	  * The Currency for this record
	  */
	public void setC_Currency_ID (int C_Currency_ID);

	/** Get Currency.
	  * The Currency for this record
	  */
	public int getC_Currency_ID();

	public org.compiere.model.I_C_Currency getC_Currency() throws RuntimeException;

    /** Column name C_DocType_ID */
    public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";

	/** Set Document Type.
	  * Document type or rules
	  */
	public void setC_DocType_ID (int C_DocType_ID);

	/** Get Document Type.
	  * Document type or rules
	  */
	public int getC_DocType_ID();

	public org.compiere.model.I_C_DocType getC_DocType() throws RuntimeException;

    /** Column name ChargeAmt */
    public static final String COLUMNNAME_ChargeAmt = "ChargeAmt";

	/** Set Charge amount.
	  * Charge Amount
	  */
	public void setChargeAmt (BigDecimal ChargeAmt);

	/** Get Charge amount.
	  * Charge Amount
	  */
	public BigDecimal getChargeAmt();

    /** Column name C_Location_ID */
    public static final String COLUMNNAME_C_Location_ID = "C_Location_ID";

	/** Set Address.
	  * Location or Address
	  */
	public void setC_Location_ID (int C_Location_ID);

	/** Get Address.
	  * Location or Address
	  */
	public int getC_Location_ID();

	public I_C_Location getC_Location() throws RuntimeException;

    /** Column name ContactName */
    public static final String COLUMNNAME_ContactName = "ContactName";

	/** Set Contact Name.
	  * Business Partner Contact Name
	  */
	public void setContactName (String ContactName);

	/** Get Contact Name.
	  * Business Partner Contact Name
	  */
	public String getContactName();

    /** Column name C_Order_ID */
    public static final String COLUMNNAME_C_Order_ID = "C_Order_ID";

	/** Set Order.
	  * Order
	  */
	public void setC_Order_ID (int C_Order_ID);

	/** Get Order.
	  * Order
	  */
	public int getC_Order_ID();

    /** Column name C_Project_ID */
    public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";

	/** Set Project.
	  * Financial Project
	  */
	public void setC_Project_ID (int C_Project_ID);

	/** Get Project.
	  * Financial Project
	  */
	public int getC_Project_ID();

	public org.compiere.model.I_C_Project getC_Project() throws RuntimeException;

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name DateOrdered */
    public static final String COLUMNNAME_DateOrdered = "DateOrdered";

	/** Set Date Ordered.
	  * Date of Order
	  */
	public void setDateOrdered (Timestamp DateOrdered);

	/** Get Date Ordered.
	  * Date of Order
	  */
	public Timestamp getDateOrdered();

    /** Column name DatePromised */
    public static final String COLUMNNAME_DatePromised = "DatePromised";

	/** Set Date Promised.
	  * Date Order was promised
	  */
	public void setDatePromised (Timestamp DatePromised);

	/** Get Date Promised.
	  * Date Order was promised
	  */
	public Timestamp getDatePromised();

    /** Column name DeliveryRule */
    public static final String COLUMNNAME_DeliveryRule = "DeliveryRule";

	/** Set Delivery Rule.
	  * Defines the timing of Delivery
	  */
	public void setDeliveryRule (String DeliveryRule);

	/** Get Delivery Rule.
	  * Defines the timing of Delivery
	  */
	public String getDeliveryRule();

    /** Column name DeliveryViaRule */
    public static final String COLUMNNAME_DeliveryViaRule = "DeliveryViaRule";

	/** Set Delivery Via.
	  * How the order will be delivered
	  */
	public void setDeliveryViaRule (String DeliveryViaRule);

	/** Get Delivery Via.
	  * How the order will be delivered
	  */
	public String getDeliveryViaRule();

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name DocStatus */
    public static final String COLUMNNAME_DocStatus = "DocStatus";

	/** Set Document Status.
	  * The current status of the document
	  */
	public void setDocStatus (String DocStatus);

	/** Get Document Status.
	  * The current status of the document
	  */
	public String getDocStatus();

    /** Column name DocumentNo */
    public static final String COLUMNNAME_DocumentNo = "DocumentNo";

	/** Set Document No.
	  * Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo);

	/** Get Document No.
	  * Document sequence number of the document
	  */
	public String getDocumentNo();

    /** Column name DocumentType */
    public static final String COLUMNNAME_DocumentType = "DocumentType";

	/** Set Document Type.
	  * Document Type
	  */
	public void setDocumentType (String DocumentType);

	/** Get Document Type.
	  * Document Type
	  */
	public String getDocumentType();

    /** Column name DocumentTypeNote */
    public static final String COLUMNNAME_DocumentTypeNote = "DocumentTypeNote";

	/** Set Document Type Note.
	  * Optional note of a document type
	  */
	public void setDocumentTypeNote (String DocumentTypeNote);

	/** Get Document Type Note.
	  * Optional note of a document type
	  */
	public String getDocumentTypeNote();

    /** Column name DUNS */
    public static final String COLUMNNAME_DUNS = "DUNS";

	/** Set D-U-N-S.
	  * Dun & Bradstreet Number
	  */
	public void setDUNS (String DUNS);

	/** Get D-U-N-S.
	  * Dun & Bradstreet Number
	  */
	public String getDUNS();

    /** Column name GrandTotal */
    public static final String COLUMNNAME_GrandTotal = "GrandTotal";

	/** Set Grand Total.
	  * Total amount of document
	  */
	public void setGrandTotal (BigDecimal GrandTotal);

	/** Get Grand Total.
	  * Total amount of document
	  */
	public BigDecimal getGrandTotal();

    /** Column name InvoiceRule */
    public static final String COLUMNNAME_InvoiceRule = "InvoiceRule";

	/** Set Invoice Rule.
	  * Frequency and method of invoicing 
	  */
	public void setInvoiceRule (String InvoiceRule);

	/** Get Invoice Rule.
	  * Frequency and method of invoicing 
	  */
	public String getInvoiceRule();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name IsSOTrx */
    public static final String COLUMNNAME_IsSOTrx = "IsSOTrx";

	/** Set Sales Transaction.
	  * This is a Sales Transaction
	  */
	public void setIsSOTrx (boolean IsSOTrx);

	/** Get Sales Transaction.
	  * This is a Sales Transaction
	  */
	public boolean isSOTrx();

    /** Column name IsTaxIncluded */
    public static final String COLUMNNAME_IsTaxIncluded = "IsTaxIncluded";

	/** Set Price includes Tax.
	  * Tax is included in the price 
	  */
	public void setIsTaxIncluded (boolean IsTaxIncluded);

	/** Get Price includes Tax.
	  * Tax is included in the price 
	  */
	public boolean isTaxIncluded();

    /** Column name Logo_ID */
    public static final String COLUMNNAME_Logo_ID = "Logo_ID";

	/** Set Logo	  */
	public void setLogo_ID (int Logo_ID);

	/** Get Logo	  */
	public int getLogo_ID();

    /** Column name M_PriceList_ID */
    public static final String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";

	/** Set Price List.
	  * Unique identifier of a Price List
	  */
	public void setM_PriceList_ID (int M_PriceList_ID);

	/** Get Price List.
	  * Unique identifier of a Price List
	  */
	public int getM_PriceList_ID();

	public org.compiere.model.I_M_PriceList getM_PriceList() throws RuntimeException;

    /** Column name M_Shipper_ID */
    public static final String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";

	/** Set Shipper.
	  * Method or manner of product delivery
	  */
	public void setM_Shipper_ID (int M_Shipper_ID);

	/** Get Shipper.
	  * Method or manner of product delivery
	  */
	public int getM_Shipper_ID();

	public org.compiere.model.I_M_Shipper getM_Shipper() throws RuntimeException;

    /** Column name M_Warehouse_ID */
    public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";

	/** Set Warehouse.
	  * Storage Warehouse and Service Point
	  */
	public void setM_Warehouse_ID (int M_Warehouse_ID);

	/** Get Warehouse.
	  * Storage Warehouse and Service Point
	  */
	public int getM_Warehouse_ID();

	public org.compiere.model.I_M_Warehouse getM_Warehouse() throws RuntimeException;

    /** Column name NAICS */
    public static final String COLUMNNAME_NAICS = "NAICS";

	/** Set NAICS/SIC.
	  * Standard Industry Code or its successor NAIC - http://www.osha.gov/oshstats/sicser.html
	  */
	public void setNAICS (String NAICS);

	/** Get NAICS/SIC.
	  * Standard Industry Code or its successor NAIC - http://www.osha.gov/oshstats/sicser.html
	  */
	public String getNAICS();

    /** Column name Name */
    public static final String COLUMNNAME_Name = "Name";

	/** Set Name.
	  * Alphanumeric identifier of the entity
	  */
	public void setName (String Name);

	/** Get Name.
	  * Alphanumeric identifier of the entity
	  */
	public String getName();

    /** Column name Name2 */
    public static final String COLUMNNAME_Name2 = "Name2";

	/** Set Name 2.
	  * Additional Name
	  */
	public void setName2 (String Name2);

	/** Get Name 2.
	  * Additional Name
	  */
	public String getName2();

    /** Column name Org_Location_ID */
    public static final String COLUMNNAME_Org_Location_ID = "Org_Location_ID";

	/** Set Org Address.
	  * Organization Location/Address
	  */
	public void setOrg_Location_ID (int Org_Location_ID);

	/** Get Org Address.
	  * Organization Location/Address
	  */
	public int getOrg_Location_ID();

	public I_C_Location getOrg_Location() throws RuntimeException;

    /** Column name PaymentTerm */
    public static final String COLUMNNAME_PaymentTerm = "PaymentTerm";

	/** Set Payment Term.
	  * Payment Term
	  */
	public void setPaymentTerm (String PaymentTerm);

	/** Get Payment Term.
	  * Payment Term
	  */
	public String getPaymentTerm();

    /** Column name PaymentTermNote */
    public static final String COLUMNNAME_PaymentTermNote = "PaymentTermNote";

	/** Set Payment Term Note.
	  * Note of a Payment Term
	  */
	public void setPaymentTermNote (String PaymentTermNote);

	/** Get Payment Term Note.
	  * Note of a Payment Term
	  */
	public String getPaymentTermNote();

    /** Column name Phone */
    public static final String COLUMNNAME_Phone = "Phone";

	/** Set Phone.
	  * Identifies a telephone number
	  */
	public void setPhone (String Phone);

	/** Get Phone.
	  * Identifies a telephone number
	  */
	public String getPhone();

    /** Column name POReference */
    public static final String COLUMNNAME_POReference = "POReference";

	/** Set Order Reference.
	  * Transaction Reference Number (Sales Order, Purchase Order) of your Business Partner
	  */
	public void setPOReference (String POReference);

	/** Get Order Reference.
	  * Transaction Reference Number (Sales Order, Purchase Order) of your Business Partner
	  */
	public String getPOReference();

    /** Column name Postal */
    public static final String COLUMNNAME_Postal = "Postal";

	/** Set ZIP.
	  * Postal code
	  */
	public void setPostal (String Postal);

	/** Get ZIP.
	  * Postal code
	  */
	public String getPostal();

    /** Column name PriorityRule */
    public static final String COLUMNNAME_PriorityRule = "PriorityRule";

	/** Set Priority.
	  * Priority of a document
	  */
	public void setPriorityRule (String PriorityRule);

	/** Get Priority.
	  * Priority of a document
	  */
	public String getPriorityRule();

    /** Column name ReferenceNo */
    public static final String COLUMNNAME_ReferenceNo = "ReferenceNo";

	/** Set Reference No.
	  * Your customer or vendor number at the Business Partner's site
	  */
	public void setReferenceNo (String ReferenceNo);

	/** Get Reference No.
	  * Your customer or vendor number at the Business Partner's site
	  */
	public String getReferenceNo();

    /** Column name SalesRep_ID */
    public static final String COLUMNNAME_SalesRep_ID = "SalesRep_ID";

	/** Set Sales Representative.
	  * Sales Representative or Company Agent
	  */
	public void setSalesRep_ID (int SalesRep_ID);

	/** Get Sales Representative.
	  * Sales Representative or Company Agent
	  */
	public int getSalesRep_ID();

	public org.compiere.model.I_AD_User getSalesRep() throws RuntimeException;

    /** Column name SalesRep_Name */
    public static final String COLUMNNAME_SalesRep_Name = "SalesRep_Name";

	/** Set Sales Representative	  */
	public void setSalesRep_Name (String SalesRep_Name);

	/** Get Sales Representative	  */
	public String getSalesRep_Name();

    /** Column name TaxID */
    public static final String COLUMNNAME_TaxID = "TaxID";

	/** Set Tax ID.
	  * Tax Identification
	  */
	public void setTaxID (String TaxID);

	/** Get Tax ID.
	  * Tax Identification
	  */
	public String getTaxID();

    /** Column name Title */
    public static final String COLUMNNAME_Title = "Title";

	/** Set Title.
	  * Name this entity is referred to as
	  */
	public void setTitle (String Title);

	/** Get Title.
	  * Name this entity is referred to as
	  */
	public String getTitle();

    /** Column name TotalLines */
    public static final String COLUMNNAME_TotalLines = "TotalLines";

	/** Set Total Lines.
	  * Total of all document lines
	  */
	public void setTotalLines (BigDecimal TotalLines);

	/** Get Total Lines.
	  * Total of all document lines
	  */
	public BigDecimal getTotalLines();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name Volume */
    public static final String COLUMNNAME_Volume = "Volume";

	/** Set Volume.
	  * Volume of a product
	  */
	public void setVolume (BigDecimal Volume);

	/** Get Volume.
	  * Volume of a product
	  */
	public BigDecimal getVolume();

    /** Column name Warehouse_Location_ID */
    public static final String COLUMNNAME_Warehouse_Location_ID = "Warehouse_Location_ID";

	/** Set Warehouse Address.
	  * Warehouse Location/Address
	  */
	public void setWarehouse_Location_ID (int Warehouse_Location_ID);

	/** Get Warehouse Address.
	  * Warehouse Location/Address
	  */
	public int getWarehouse_Location_ID();

	public I_C_Location getWarehouse_Location() throws RuntimeException;

    /** Column name Weight */
    public static final String COLUMNNAME_Weight = "Weight";

	/** Set Weight.
	  * Weight of a product
	  */
	public void setWeight (BigDecimal Weight);

	/** Get Weight.
	  * Weight of a product
	  */
	public BigDecimal getWeight();
}
