package service;

import java.util.Map;

import dao.ProductDao;
import domain.Product;

public class BusinessService {
	private ProductDao dao= new ProductDao();
	
	public Map getAllProduct(){
		return dao.getAll();
	}
	public Product findProduct(String id){
		return dao.find(id);
	}
}
