package com.jolat.euler.exception;

public class YouFuckedUpException extends ProjectEulerException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 174704702307273503L;

	public YouFuckedUpException(String message) {
		super(message);
	}

	public YouFuckedUpException(String message, Throwable e) {
		super(message, e);
	}
}
