package com.formacionbdsprinbootappproduct.models.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionbdsprinbootappproduct.models.Dao.ProductoDao;
import com.formacionbdsprinbootappproduct.models.entity.Producto;
/*implementar metodos*/
@Service /*registra esta clase como un componente*/
public class ProductoServiceImpl implements IProductoService{
	
	@Autowired  private ProductoDao productoDao;

	@Override
	@Transactional (readOnly = true) /*enlasada con la base de datos*/
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return (List<Producto>)productoDao.findAll();
	}

	@Override
	@Transactional (readOnly = true)
	public Producto findById(long id) {
		// TODO Auto-generated method stub
		return productoDao.findById(id).orElse(null);
	}
	

}
