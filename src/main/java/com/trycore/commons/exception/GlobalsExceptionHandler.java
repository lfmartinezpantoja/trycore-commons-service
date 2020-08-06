package com.trycore.commons.exception;

import javax.servlet.http.HttpServletResponse;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.trycore.commons.dto.ErrorResponseDTO;
import com.trycore.commons.messages.MessagesEnum;

import feign.FeignException;
import lombok.extern.java.Log;

@Log
@RestControllerAdvice
public class GlobalsExceptionHandler {

	@Autowired
	ModelMapper modelMapper;

	@ResponseBody
	@ExceptionHandler(value = CustomException.class)
	public ResponseEntity<ErrorResponseDTO> handlerException(CustomException exception) {
		log.info("Ocurrio un error  controlado: " + exception.getErrorEnum().description);
		return new ResponseEntity<>(
				new ErrorResponseDTO(exception.getErrorEnum().code,
						String.format(exception.getErrorEnum().description, exception.getParam())),
				exception.getHttpStatus());
	}

	@ExceptionHandler(FeignException.class)
	public ResponseEntity<ErrorResponseDTO> handleFeignStatusException(FeignException e, HttpServletResponse response) {
		response.setStatus(e.status());
		log.info("Ocurrio un error consumiendo otro servicio, error: " + e.getLocalizedMessage());
		return new ResponseEntity<>(
				new ErrorResponseDTO(MessagesEnum.FEING_ERROR.code,
						String.format(MessagesEnum.FEING_ERROR.description, e.getMessage())),
				HttpStatus.valueOf(e.status()));
	}
}
