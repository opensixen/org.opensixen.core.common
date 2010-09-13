/**
 * 
 */
package org.opensixen.interfaces;

import org.opensixen.exception.OSXException;
import org.opensixen.osgi.interfaces.IService;

/**
 * 
 * 
 * @author Eloy Gomez
 * Indeos Consultoria http://www.indeos.es
 *
 */
public interface IStartupProcess extends IService {
	
	public boolean run() throws OSXException;
	
}
