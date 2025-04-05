package com.marks.service.exception;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MarksExceptions extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarksExceptions(String message) {
		super(message);
	}
}
