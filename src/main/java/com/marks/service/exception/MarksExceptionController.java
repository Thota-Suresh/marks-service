package com.marks.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MarksExceptionController {

	@ExceptionHandler(MarksExceptions.class)
	public ResponseEntity<String> MarksExceptions(MarksExceptions message) {
		return new ResponseEntity<>(message.getMessage(), HttpStatus.BAD_REQUEST);
	}

	
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<String> nullPointerExceptions(NullPointerException message) {
		return new ResponseEntity<>(message.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
}
