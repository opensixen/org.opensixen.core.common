 /******* BEGIN LICENSE BLOCK *****
 * Versión: GPL 2.0/CDDL 1.0/EPL 1.0
 *
 * Los contenidos de este fichero están sujetos a la Licencia
 * Pública General de GNU versión 2.0 (la "Licencia"); no podrá
 * usar este fichero, excepto bajo las condiciones que otorga dicha 
 * Licencia y siempre de acuerdo con el contenido de la presente. 
 * Una copia completa de las condiciones de de dicha licencia,
 * traducida en castellano, deberá estar incluida con el presente
 * programa.
 * 
 * Adicionalmente, puede obtener una copia de la licencia en
 * http://www.gnu.org/licenses/gpl-2.0.html
 *
 * Este fichero es parte del programa opensiXen.
 *
 * OpensiXen es software libre: se puede usar, redistribuir, o
 * modificar; pero siempre bajo los términos de la Licencia 
 * Pública General de GNU, tal y como es publicada por la Free 
 * Software Foundation en su versión 2.0, o a su elección, en 
 * cualquier versión posterior.
 *
 * Este programa se distribuye con la esperanza de que sea útil,
 * pero SIN GARANTÍA ALGUNA; ni siquiera la garantía implícita 
 * MERCANTIL o de APTITUD PARA UN PROPÓSITO DETERMINADO. Consulte 
 * los detalles de la Licencia Pública General GNU para obtener una
 * información más detallada. 
 *
 * TODO EL CÓDIGO PUBLICADO JUNTO CON ESTE FICHERO FORMA PARTE DEL 
 * PROYECTO OPENSIXEN, PUDIENDO O NO ESTAR GOBERNADO POR ESTE MISMO
 * TIPO DE LICENCIA O UNA VARIANTE DE LA MISMA.
 *
 * El desarrollador/es inicial/es del código es
 *  FUNDESLE (Fundación para el desarrollo del Software Libre Empresarial).
 *  Indeos Consultoria S.L. - http://www.indeos.es
 *
 * Contribuyente(s):
 *  Eloy Gómez García <eloy@opensixen.org> 
 *
 * Alternativamente, y a elección del usuario, los contenidos de este
 * fichero podrán ser usados bajo los términos de la Licencia Común del
 * Desarrollo y la Distribución (CDDL) versión 1.0 o posterior; o bajo
 * los términos de la Licencia Pública Eclipse (EPL) versión 1.0. Una 
 * copia completa de las condiciones de dichas licencias, traducida en 
 * castellano, deberán de estar incluidas con el presente programa.
 * Adicionalmente, es posible obtener una copia original de dichas 
 * licencias en su versión original en
 *  http://www.opensource.org/licenses/cddl1.php  y en  
 *  http://www.opensource.org/licenses/eclipse-1.0.php
 *
 * Si el usuario desea el uso de SU versión modificada de este fichero 
 * sólo bajo los términos de una o más de las licencias, y no bajo los 
 * de las otra/s, puede indicar su decisión borrando las menciones a la/s
 * licencia/s sobrantes o no utilizadas por SU versión modificada.
 *
 * Si la presente licencia triple se mantiene íntegra, cualquier usuario 
 * puede utilizar este fichero bajo cualquiera de las tres licencias que 
 * lo gobiernan,  GPL 2.0/CDDL 1.0/EPL 1.0.
 *
 * ***** END LICENSE BLOCK ***** */

package org.opensixen.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.compiere.util.Env;

/**
 * 
 * 
 * 
 * @author Eloy Gomez
 * Indeos Consultoria http://www.indeos.es
 *
 */
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
