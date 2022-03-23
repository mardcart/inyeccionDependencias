package com.mardcart.springboot.di.app.models.domain;

public class Detalle {

	private Producto producto;
	private Integer cantidad;
	
	
	public Detalle(Producto producto, Integer cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Integer  calcular() {
		
		return cantidad * producto.getPrecio();
	}
	
}
