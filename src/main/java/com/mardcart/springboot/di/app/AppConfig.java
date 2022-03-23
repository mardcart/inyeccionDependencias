package com.mardcart.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mardcart.springboot.di.app.models.domain.Detalle;
import com.mardcart.springboot.di.app.models.domain.Producto;

@Configuration
public class AppConfig {

	@Bean("detalleFactura")
	public List<Detalle> registrarDetalle(){
		
		Producto p = new Producto("martillo de madera", 300);
		Producto p1 = new Producto("sierra electrica", 500);
		
		Detalle d = new Detalle(p, 4);
		Detalle d1 = new Detalle(p1, 2);
		
		return Arrays.asList(d,d1);
		
	}
}
