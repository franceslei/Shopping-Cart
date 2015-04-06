package DB;

import java.util.LinkedHashMap;
import java.util.Map;

import domain.Product;

public class DB {
	private static Map map = new LinkedHashMap();
	static{
		map.put("1", new Product("1","Book",25,"a book for java programming"));
		map.put("2", new Product("2","Apple",5,"fruit"));
		map.put("3", new Product("3","Pencil",2,"for writing"));
		map.put("4", new Product("4","bike",50,"bicycle"));
		map.put("5", new Product("5","Coffee",5,"sth for drink"));
	}
	
	public static Map getAll(){
		return map;
	}
}

