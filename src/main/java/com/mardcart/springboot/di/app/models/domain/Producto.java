package com.mardcart.springboot.di.app.models.domain;

public class Producto {

	private String descripcion;
	private Integer precio;
	
	public Producto(String descripcion, Integer precio) {

		this.descripcion = descripcion;
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	
	
	
}
