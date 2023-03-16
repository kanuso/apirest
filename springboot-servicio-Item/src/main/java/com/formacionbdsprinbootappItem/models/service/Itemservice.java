package com.formacionbdsprinbootappItem.models.service;

import java.util.List;

import com.formacionbdsprinbootappItem.models.Item;

public interface Itemservice {
	public List<Item> findAll();
	public Item findById(long id, Integer cantidad);

}
