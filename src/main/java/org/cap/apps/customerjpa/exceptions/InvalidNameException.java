package org.cap.apps.customerjpa.exceptions;
public class InvalidNameException extends RuntimeException {

	public InvalidNameException() {

	}

	public InvalidNameException(String msg) {
		super(msg);
	}
}
