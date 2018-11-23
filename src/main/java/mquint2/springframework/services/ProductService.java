package mquint2.springframework.services;

import java.util.List;

import mquint2.springframework.domain.Product;

public interface ProductService {
	
	List<Product> listAllProducts();
	Product getProductById(Integer id);

}
