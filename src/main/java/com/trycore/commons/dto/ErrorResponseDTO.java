package com.trycore.commons.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponseDTO implements Serializable {

	private int code;
	private String description;
	private static final long serialVersionUID = -2522981267033949083L;

}
