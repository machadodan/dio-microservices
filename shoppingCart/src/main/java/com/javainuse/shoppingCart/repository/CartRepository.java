package com.javainuse.shoppingCart.repository;

import com.javainuse.shoppingCart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {

    //Cart findByCustomerId(Integer customerId);
}
