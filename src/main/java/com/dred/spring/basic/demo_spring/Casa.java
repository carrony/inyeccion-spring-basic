package com.dred.spring.basic.demo_spring;

public class Casa {

	private String direccion;
	private Persona propietario;
	
	public Casa(String direccion, Persona propietario) {
		super();
		this.direccion = direccion;
		this.propietario = propietario;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Persona getPropietario() {
		return propietario;
	}
	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}
	@Override
	public String toString() {
		return "Casa [direccion=" + direccion + ", propietario=" + propietario + "]";
	}
	
	
	
	
}
