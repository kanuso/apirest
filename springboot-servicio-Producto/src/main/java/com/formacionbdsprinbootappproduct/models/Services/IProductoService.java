package com.formacionbdsprinbootappproduct.models.Services;

import java.util.List;

import com.formacionbdsprinbootappproduct.models.entity.Producto;
/*servicios de la api*/
/*lista del  producto*/
public interface IProductoService {
	public List<Producto> findAll();
	/*buscar por id*/
	public Producto findById(long id);
	

}
