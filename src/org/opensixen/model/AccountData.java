/**
 * 
 */
package org.opensixen.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.compiere.util.Env;

public class AccountData	{
	
	private String name;
	private String value;
	private BigDecimal debe = Env.ZERO;
	private BigDecimal haber = Env.ZERO;
	private BigDecimal saldoInicial = Env.ZERO;
	
	private M_SaldoAcumulado SaldoAcumulado;
	
	private String AccountType;
	private String AccountSign;
	

	public AccountData (ResultSet rs)	{
		try {
			name = rs.getString("Name");
			debe = rs.getBigDecimal("Debe");
			haber = rs.getBigDecimal("Haber");
			AccountSign = rs.getString("AccountSign");
			AccountType = rs.getString("AccountType");
		}
		catch (SQLException e)	{
			
		}	
	}
	
	public AccountData (String name)	{
		this.name = name;
	}
	
	/**
	 * Devuelve el saldo contandolo como saldoInicial + (debe - haber)
	 * o saldoInicial + (haber - debe)
	 * @return
	 */
	public BigDecimal getSaldo()	{
		
		BigDecimal saldo = getDebe().subtract(getHaber());
					
		if (mustSumAcumulated())	{
			saldo = saldo.add(getSaldoInicial());
			return saldo;
		}
		else {
			return saldo;
		}
	}
	

	public BigDecimal getDebe() {				
		if (SaldoAcumulado != null && mustSumAcumulated())	{
			return debe.add(SaldoAcumulado.getDebe());
		}
		else {
			return debe;
		}
	}
	
	
	
	public void setDebe(BigDecimal debe) {
		this.debe = debe;
	}
	
	
	public BigDecimal getHaber() {		
		if (SaldoAcumulado != null && mustSumAcumulated())	{
			return haber.add(SaldoAcumulado.getHaber());
		}
		else {
			return haber;
		}
	}
	
	
	public void setHaber(BigDecimal haber) {
		this.haber = haber;
	}
	
	
	public String getName() {
	
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public BigDecimal getSaldoInicial() {
		return saldoInicial;
	}
	public void setSaldoInicial(BigDecimal saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

	/**
	 * @return the saldoAcumulado
	 */
	public M_SaldoAcumulado getSaldoAcumulado() {
		return SaldoAcumulado;
	}



	/**
	 * @param saldoAcumulado the saldoAcumulado to set
	 */
	public void setSaldoAcumulado(M_SaldoAcumulado saldoAcumulado) {
		SaldoAcumulado = saldoAcumulado;
	}



	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return AccountType;
	}



	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(String accountType) {
		AccountType = accountType;
	}



	/**
	 * @return the accountSign
	 */
	public String getAccountSign() {
		return AccountSign;
	}



	/**
	 * @param accountSign the accountSign to set
	 */
	public void setAccountSign(String accountSign) {
		AccountSign = accountSign;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}



	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
	public String getGroupName3()	{
		return value.substring(0, 3);
	}
	
	public String getGroupName4()	{
		return value.substring(0, 4);
	}
	
	
	public boolean mustSumAcumulated()	{
		if (getAccountSign() == "N")	{

			//if (getAccountType() != "A" || getAccountType() != "E")	{
			if (getAccountType() != "A")	{
				return false;
			}
		}
		return true;
	}
	
	
}


class M_SaldoAcumulado extends AccountData	{

	public M_SaldoAcumulado(ResultSet rs) {
		super(rs);
	}
	
	@Override
	public boolean mustSumAcumulated() {
		return false;
	}
	
}
