package com.jolat.euler.exception;

public class ProjectEulerException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6550641654127660388L;

	public ProjectEulerException(String message) {
		super(message);
	}

	public ProjectEulerException(String message, Throwable e) {
		super(message, e);
	}
}
