package com.javainuse.productcatalog.controller;

import com.javainuse.productcatalog.model.Products;
import com.javainuse.productcatalog.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductsController {

    @Autowired
    private ProductsRepository productsRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Products create(@RequestBody Products products) {
        return productsRepository.save(products);
    }

    @RequestMapping
    public Iterable<Products> list() {
        return productsRepository.findAll();
    }

    @RequestMapping(value = "/{id}")
    public Optional<Products> findById(@PathVariable("id") Integer id) {
        return productsRepository.findById(id);
    }

    @RequestMapping(value = "/name/{name}")
    public Iterable<Products> findByName(@PathVariable("name") String name) {
        return productsRepository.findByName(name);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Integer id) throws Exception {
        productsRepository.deleteById(id);

    }


}
