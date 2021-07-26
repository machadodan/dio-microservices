package com.javainuse.productcatalog.repository;

import com.javainuse.productcatalog.controller.ProductsController;
import com.javainuse.productcatalog.model.Products;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductsRepository extends CrudRepository<Products, Integer> {

   List<Products> findByName(String name);


}
