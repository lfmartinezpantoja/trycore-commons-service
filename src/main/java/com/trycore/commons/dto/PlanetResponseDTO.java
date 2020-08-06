package com.trycore.commons.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PlanetResponseDTO implements Serializable {

	private int code;
	private String description;
	private List<PlanetDTO> planetsDTO;
	private static final long serialVersionUID = -8339126943568264083L;

	public PlanetResponseDTO(int code, String description) {
		super();
		this.code = code;
		this.description = description;
	}

	public PlanetResponseDTO(int code, String description, List<PlanetDTO> planetsDTO) {
		super();
		this.code = code;
		this.description = description;
		this.planetsDTO = planetsDTO;
	}
}
