package com.formacionbdsprinbootappItem.models.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.formacionbdsprinbootappItem.models.Item;
@Service /*sirve para extraer los datos de otra apirest */
public class ItemServiceImpl implements Itemservice {

	@Override
	public List<Item> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item findById(long id, Integer cantidad) {
		// TODO Auto-generated method stub
		return null;
	}

}
