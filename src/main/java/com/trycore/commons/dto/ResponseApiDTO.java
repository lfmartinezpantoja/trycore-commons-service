package com.trycore.commons.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class ResponseApiDTO implements Serializable {

	private int code;
	private String description;
	private List<PersonDTO> personsDTO;
	private static final long serialVersionUID = -8339126943568264083L;

	public ResponseApiDTO(int code, String description) {
		super();
		this.code = code;
		this.description = description;
	}

	public ResponseApiDTO(int code, String description, List<PersonDTO> personsDTO) {
		super();
		this.code = code;
		this.description = description;
		this.personsDTO = personsDTO;
	}
}
