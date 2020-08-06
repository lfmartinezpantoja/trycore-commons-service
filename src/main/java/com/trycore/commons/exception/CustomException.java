package com.trycore.commons.exception;

import org.springframework.http.HttpStatus;

import com.trycore.commons.messages.MessagesEnum;

import lombok.Getter;

@Getter
public class CustomException extends RuntimeException {

	private static final long serialVersionUID = 755399362535716275L;
	private final HttpStatus httpStatus;
	private final MessagesEnum errorEnum;
	private final String param;

	public CustomException(HttpStatus httpStatus, MessagesEnum errorEnum, String param) {
		super();
		this.httpStatus = httpStatus;
		this.errorEnum = errorEnum;
		this.param = param;
	}

	public CustomException(HttpStatus httpStatus, MessagesEnum errorEnum) {
		super();
		this.httpStatus = httpStatus;
		this.errorEnum = errorEnum;
		this.param = "";
	}

}
