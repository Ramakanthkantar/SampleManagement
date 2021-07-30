package com.kantar.chinapannel.chinapannelmanagement.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;

import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageConversionException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class  GlobalExceptionHandler {
	
	
	@ResponseStatus(HttpStatus.BAD_REQUEST) // 400
	@ExceptionHandler(IllegalArgumentException.class)
	@ResponseBody
	public ErrorInformation handleIllegal(IllegalArgumentException e) {
	  return new ErrorInformation("Bad request", e);
	}

   
}
