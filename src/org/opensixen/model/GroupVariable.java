/**
 * 
 */
package org.opensixen.model;

/**
 * @author harlock
 *
 */
public class GroupVariable {

	private String name;
	
	private int calculation;
	
	private String style;

	
	public static final int SUM=0;
	
	public static final String STYLE_DEFAULT="default";
	
	
	
	public GroupVariable(String name, int calculation) {
		super();
		this.name = name;
		this.calculation = calculation;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the calculation
	 */
	public int getCalculation() {
		return calculation;
	}

	/**
	 * @param calculation the calculation to set
	 */
	public void setCalculation(int calculation) {
		this.calculation = calculation;
	}

	/**
	 * @return the style
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * @param style the style to set
	 */
	public void setStyle(String style) {
		this.style = style;
	}
		
}
