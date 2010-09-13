/**
 * 
 */
package org.opensixen.exception;

/**
 * Runtime Exception
 *   
 * 
 * @author Eloy Gomez
 * Indeos Consultoria http://www.indeos.es
 *
 */
public class OSXRuntimeException extends OSXException {

	private static final long serialVersionUID = 1L;

	public OSXRuntimeException() {
		super();
	}

	public OSXRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}

	public OSXRuntimeException(String message) {
		super(message);
	}

	public OSXRuntimeException(Throwable cause) {
		super(cause);
	}
	
}
