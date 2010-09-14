/**
 * 
 */
package org.opensixen.interfaces;

import javax.swing.table.TableModel;

import org.opensixen.model.ColumnDefinition;

/**
 * @author harlock
 *
 */
public interface OTableModel extends TableModel  {
	
	public void reload();
	
	public abstract ColumnDefinition[] getColumnDefinitions();

}
