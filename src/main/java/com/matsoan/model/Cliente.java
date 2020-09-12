package com.matsoan.model;

public class Cliente {
	private String cl_rut;
	private String cl_nombre;
	private String cl_rubro;
	private String cl_numero;
	private String cl_email;
	private String cl_desc;
	private String cl_ubi;

	public Cliente() {
	}

	public Cliente(String rut, String nombre, String rubro, String numero, String email, String desc, String ubi) {
		this.cl_rut = rut;
		this.cl_nombre = nombre;
		this.cl_rubro = rubro;
		this.cl_numero = numero;
		this.cl_email = email;
		this.cl_desc = desc;
		this.cl_ubi = ubi;
	}

	public String getCl_rut() {
		return cl_rut;
	}

	public void setCl_rut(String cl_rut) {
		this.cl_rut = cl_rut;
	}

	public String getCl_nombre() {
		return cl_nombre;
	}

	public void setCl_nombre(String cl_nombre) {
		this.cl_nombre = cl_nombre;
	}

	public String getCl_rubro() {
		return cl_rubro;
	}

	public void setCl_rubro(String cl_rubro) {
		this.cl_rubro = cl_rubro;
	}

	public String getCl_email() {
		return cl_email;
	}

	public void setCl_email(String cl_email) {
		this.cl_email = cl_email;
	}

	public String getCl_numero() {
		return cl_numero;
	}

	public void setCl_numero(String cl_numero) {
		this.cl_numero = cl_numero;
	}

	public String getCl_desc() {
		return cl_desc;
	}

	public void setCl_desc(String cl_desc) {
		this.cl_desc = cl_desc;
	}

	public String getCl_ubi() {
		return cl_ubi;
	}

	public void setCl_ubi(String cl_ubi) {
		this.cl_ubi = cl_ubi;
	}

	@Override
	public String toString() {
		return this.cl_rut + ", " + this.cl_nombre;
	}

}
