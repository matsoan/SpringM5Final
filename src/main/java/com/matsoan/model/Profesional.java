package com.matsoan.model;

public class Profesional {
	private String pr_rut;
	private String pr_nombres;
	private String pr_apellidos;
	private String pr_ocupacion;
	private String pr_numero;
	private String pr_email;

	public Profesional() {}
	
	public Profesional(String rut, String nombres, String apellidos,
			String ocupacion, String numero, String email) {
		this.pr_rut = rut;
		this.pr_nombres = nombres;
		this.pr_apellidos = apellidos;
		this.pr_ocupacion = ocupacion;
		this.pr_numero = numero;
		this.pr_email = email;
	}

	public String getPr_rut() {
		return pr_rut;
	}

	public void setPr_rut(String pr_rut) {
		this.pr_rut = pr_rut;
	}

	public String getPr_nombres() {
		return pr_nombres;
	}

	public void setPr_nombres(String pr_nombres) {
		this.pr_nombres = pr_nombres;
	}

	public String getPr_apellidos() {
		return pr_apellidos;
	}

	public void setPr_apellidos(String pr_apellidos) {
		this.pr_apellidos = pr_apellidos;
	}

	public String getPr_ocupacion() {
		return pr_ocupacion;
	}

	public void setPr_ocupacion(String pr_ocupacion) {
		this.pr_ocupacion = pr_ocupacion;
	}

	public String getPr_numero() {
		return pr_numero;
	}

	public void setPr_numero(String pr_numero) {
		this.pr_numero = pr_numero;
	}

	public String getPr_email() {
		return pr_email;
	}

	public void setPr_email(String pr_email) {
		this.pr_email = pr_email;
	}


	@Override
	public String toString() {
		return this.pr_rut + ", " + this.pr_nombres + " " + this.pr_apellidos;
	}
	
	
	
}
