package domain;

import java.util.LinkedHashMap;
import java.util.Map;

public class Cart {
	private Map<String, CountItem> map=new LinkedHashMap();
	private double price;   //the total for the shopping cart
	
	public void add(Product product){
		CountItem item=map.get(product.getId());
		if(item==null){
			item=new CountItem();
			item.setProduct(product);
			item.setQuantity(1);
			map.put(product.getId(), item);
		} else{
			item.setQuantity(item.getQuantity()+1);
		}
	}

	public Map<String, CountItem> getMap() {
		return map;
	}

	public void setMap(Map<String, CountItem> map) {
		this.map = map;
	}

	public double getPrice() {
		double totalprice=0;
		for (Map.Entry<String, CountItem> entry: map.entrySet()){
			CountItem item=entry.getValue();
		    totalprice+=item.getPrice();
		}
		this.price=totalprice;
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
