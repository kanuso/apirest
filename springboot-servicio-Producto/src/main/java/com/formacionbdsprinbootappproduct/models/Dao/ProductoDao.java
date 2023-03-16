package com.formacionbdsprinbootappproduct.models.Dao;

import org.springframework.data.repository.CrudRepository;

import com.formacionbdsprinbootappproduct.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long>{
	

}
