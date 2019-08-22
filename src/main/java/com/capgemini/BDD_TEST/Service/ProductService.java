package com.capgemini.BDD_TEST.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.BDD_TEST.Model.Product;
import com.capgemini.BDD_TEST.Repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public void addProduct(Product product) {
		productRepository.save(product);
	}

	public void deleteProduct(int id) {
		productRepository.deleteById(id);
	}

	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}
	
	public Optional<Product> getProductById(int id)
	{
		return productRepository.findById(id);
	}
}
