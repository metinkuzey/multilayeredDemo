package com.metinkuzey.multiLayeredDemo.business.abstracts;

import com.metinkuzey.multiLayeredDemo.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    void add(Product product);
    List<Product> getAllProduct();
}
