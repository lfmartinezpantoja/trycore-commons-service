package com.trycore.commons.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class PlanetDTO implements Serializable {

	private Long idPlanet;
	private String planetName;
	private int rotationPeriod;
	private double diameter;
	private String weather;
	private String ground;
	private boolean enabled;
	private static final long serialVersionUID = -450269450022090524L;

}
