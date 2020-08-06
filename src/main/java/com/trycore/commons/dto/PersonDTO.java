package com.trycore.commons.dto;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.Data;

@Data
public class PersonDTO implements Serializable {

	private Long idPerson;
	private int identificationNumber;
	private int age;
	private String name;
	private double weight;
	private double height;
	private String gender;
	private LocalDate birthDate;
	private Long idPlanet;
	private boolean enabled;
	private static final long serialVersionUID = -7500786245435362192L;
}
