package com.formacionbdsprinbootappproduct.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.formacionbdsprinbootappproduct.models.Services.IProductoService;
import com.formacionbdsprinbootappproduct.models.entity.Producto;

@RestController  /*indica que es un controlador rest de spring*/
public class ProductoController {
	@Autowired  /*autowire para inyectar nuestra clase service*/
	private IProductoService productoService;
	
	/*metodo handler*/
	@GetMapping ("/listar")      /*getmapping para mapear los metodos*/
	public List<Producto>listar(){
		return productoService.findAll();
	}
	@GetMapping ("/ver/{id}") /* pathvariable para pasar la variable dentro de la url  <--este url  id*/
	public Producto detalle(@PathVariable long id) {
		return productoService.findById(id);
	}

}
