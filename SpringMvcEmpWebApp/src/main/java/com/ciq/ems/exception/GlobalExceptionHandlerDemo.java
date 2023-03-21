package com.ciq.ems.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandlerDemo {

//	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
//	@ExceptionHandler(value = PageNotFoundException.class)
//	public String handlePageNotFoundException(PageNotFoundException ph) {
//		System.out.println("page nor found " + ph);
//		return "pageNotFound";
//
//	}
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = Exception.class)
	public String handleIOException(Exception exception) {
		System.out.println(" exception occured: " + exception);
		return "exception-error";
	}

	

}
