package com.trycore.commons.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "persons")
public class Person implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPerson;
	private int identificationNumber;
	private int age;
	private String name;
	private double weight;
	private double height;
	private String gender;
	private LocalDate birthDate;
	@ManyToOne
	@JoinColumn(name = "idPlanet")
	private Planet planet;
	private Long counterViews;
	private boolean enabled;
	private static final long serialVersionUID = -4876373852890228220L;
}
