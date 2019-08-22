package com.capgemini.BDD_TEST.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.BDD_TEST.Model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, Integer> {

}
