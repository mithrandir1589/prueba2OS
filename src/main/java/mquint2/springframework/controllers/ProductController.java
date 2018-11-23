package mquint2.springframework.controllers;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import mquint2.springframework.domain.Product;
import mquint2.springframework.services.ProductService;

@Controller
public class ProductController {
	
	private ProductService productService;

	@Autowired	
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}


	@RequestMapping("/products")
	public String listProducts(Model model) {
		model.addAttribute("products", productService.listAllProducts());
		return "products";
	}
	
	@RequestMapping("/product/{id}")
	public String getProduct(@PathVariable Integer id, Model model) {
		model.addAttribute("product", productService.getProductById(id));
		return "product";
		
	}
	
	@RequestMapping("/product/new")
	public String newProduct(Model model) {
		model.addAttribute("product",new Product());
		return "productform";
	}

}
