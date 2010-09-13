/**
 * 
 */
package org.opensixen.exception;

/**
 * Base exception for Opensixen  
 * 
 * @author Eloy Gomez
 * Indeos Consultoria http://www.indeos.es
 *
 */
public class OSXException extends Exception {

	private static final long serialVersionUID = 1L;

	public OSXException() {
		super();
	}

	public OSXException(String message, Throwable cause) {
		super(message, cause);
	}

	public OSXException(String message) {
		super(message);
	}

	public OSXException(Throwable cause) {
		super(cause);
	}
	
}
