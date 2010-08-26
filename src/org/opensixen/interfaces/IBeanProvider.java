/**
 * 
 */
package org.opensixen.interfaces;

/**
 * @author harlock
 *
 */
public interface IBeanProvider {
	
	public Object[] getModel();
	
	public void reload();
	
	public Class getModelClass();

}
