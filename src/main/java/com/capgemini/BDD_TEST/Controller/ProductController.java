package com.capgemini.BDD_TEST.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.BDD_TEST.Model.Product;
import com.capgemini.BDD_TEST.Service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping(value = "/addProduct")
	public String addProduct(@RequestBody Product product) {
		productService.addProduct(product);
		return "Product Added";
	}

	@DeleteMapping(value = "/deleteProduct/{id}")
	public void deleteProduct(@PathVariable int id) {
		productService.deleteProduct(id);
	}

	@GetMapping(value = "/getAllProduct")
	public List<Product> getAllProducts() {
		return productService.getAllProduct();
	}
	
	@GetMapping(value = "/getProduct/{id}")
	public Optional<Product> getProduct(@PathVariable int id) {
		return productService.getProductById(id);
	}
}
