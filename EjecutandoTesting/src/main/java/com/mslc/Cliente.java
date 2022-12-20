package com.mslc;

public class Cliente {
	
	private int edad;
	private boolean estudiante;
	private boolean independizado;
	
	public Cliente(int edad, boolean estudiante, boolean independizado) {
		super();
		this.edad = edad;
		this.estudiante = estudiante;
		this.independizado = independizado;
	}

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public int getEdad() {
		return edad;
	}

	public boolean isEstudiante() {
		return estudiante;
	}

	public boolean isIndependizado() {
		return independizado;
	}


}
