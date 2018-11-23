package mquint2.springframework.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import mquint2.springframework.domain.Product;

@Service
public class ProductServiceImpl implements ProductService {

	private Map<Integer, Product> products; 
	
	
	
	public ProductServiceImpl() {
		loadProducts();
	}

	@Override
	public List<Product> listAllProducts() {
		return new ArrayList<>(products.values());		
	}
	
	@Override
	public Product getProductById(Integer id) {
		return products.get(id);
	}
	
	public void loadProducts() {
		products = new HashMap<>();
		
		Product product1= new Product();
		product1.setDescription("Product 1");
		product1.setId(1);
		product1.setPrice(new BigDecimal("12.99"));
		product1.setImageURL("www.example.com/product1");
		
		products.put(1, product1);
		
		Product product2= new Product();
		product2.setDescription("Product 2");
		product2.setId(2);
		product2.setPrice(new BigDecimal("13.99"));
		product2.setImageURL("www.example.com/product2");
		
		products.put(2, product2);
		
		Product product3= new Product();
		product3.setDescription("Product 1");
		product3.setId(1);
		product3.setPrice(new BigDecimal("15.99"));
		product3.setImageURL("www.example.com/product3");
		
		products.put(3, product3);
		
		
		
		
	}



	

}
