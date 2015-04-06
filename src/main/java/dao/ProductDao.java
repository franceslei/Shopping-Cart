package dao;

import java.util.Map;

import DB.DB;
import domain.Product;

public class ProductDao {
	public Map getAll(){
		return DB.getAll();
	}
	
	public Product find(String id){
		return (Product) DB.getAll().get(id);
	}
	
}
