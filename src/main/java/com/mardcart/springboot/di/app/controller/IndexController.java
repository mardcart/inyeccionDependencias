package com.mardcart.springboot.di.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mardcart.springboot.di.app.models.service.IServicio;

@Controller
public class IndexController {

	//	private MiServicio servicio = new MiServicio();
	//	@Autowired
	//	private MiServicio servicio;
//	SE PUEDE INYECTAR EN LA DECLARACION COMO TAMBIEN EN EL CONSTRUCTOR Y EL SETTERS
//	@Autowired
//	public IndexController(IServicio servicio) {
//		this.servicio = servicio;
//	}	
//	@Autowired
//	public void setServicio(IServicio servicio) {
//		this.servicio = servicio;
//	}

	@Autowired
	//@Qualifier("miServicioComplejo")
	private IServicio servicio;

	

	@GetMapping({"/index","","/"})
	public String Index(Model modelo) {
		
		modelo.addAttribute("objeto", servicio.operacion());

		return "index";
	}


}
