package com.trycore.commons.messages;

public enum MessagesEnum {

	SUCCESFULLY_OPERATION(0, "Operacion realizada con exito"),
	PERSON_NOT_FOUND(1, "Persona con identificacion %s no encontrada"),
	PLANET_NOT_FOUND(2, "Planeta con id %s no esta registrado"),
	PLANET_ALREADY_EXIST(3, "Planeta con nombre %s ya se encuentra registrado"),
	FEING_ERROR(4, "Se presento el siguiente error consumiendo otro servicio: %s");

	public final int code;
	public final String description;

	private MessagesEnum(int code, String description) {
		this.code = code;
		this.description = description;
	}

}
