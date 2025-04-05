package com.marks.service.exception;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MarksExceptions extends RuntimeException {

	public MarksExceptions(String message) {
		super(message);
	}
}
