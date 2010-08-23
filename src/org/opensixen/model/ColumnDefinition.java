/**
 * 
 */
package org.opensixen.model;


/**
 * @author harlock
 *
 */
public class ColumnDefinition {

	private String name;
	
	private String title;
	
	private Class clazz;

	private int size = 90;

	private String pattern;
	

	
	
	public ColumnDefinition(String name) {
		super();
		this.name = name;
	}

	public ColumnDefinition(String name, Class clazz) {
		super();
		this.name = name;
		this.clazz = clazz;
	}

	public ColumnDefinition(String name, Class clazz, int size) {
		super();
		this.name = name;
		this.clazz = clazz;
		this.size = size;
	}
	
	public ColumnDefinition(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}
		
	
	public ColumnDefinition(String name, String title, Class clazz) {
		super();
		this.name = name;
		this.title = title;
		this.clazz = clazz;
	}

	public ColumnDefinition(String name, String title, Class clazz, int size) {
		super();
		this.name = name;
		this.title = title;
		this.clazz = clazz;
		this.size = size;
	}

	public ColumnDefinition(String name, String title, Class clazz, int size,
			String pattern) {
		super();
		this.name = name;
		this.title = title;
		this.clazz = clazz;
		this.size = size;
		this.pattern = pattern;
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}
	
	/**
	 * @return the clazz
	 */
	public Class getClazz() {
		return clazz;
	}

	/**
	 * @param clazz the clazz to set
	 */
	public void setClazz(Class clazz) {
		this.clazz = clazz;
	}

	/**
	 * @return the pattern
	 */
	public String getPattern() {
		return pattern;
	}

	/**
	 * @param pattern the pattern to set
	 */
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	
	
}
