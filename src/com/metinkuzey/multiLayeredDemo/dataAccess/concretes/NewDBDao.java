package com.metinkuzey.multiLayeredDemo.dataAccess.concretes;

import com.metinkuzey.multiLayeredDemo.dataAccess.abstracts.ProductDao;
import com.metinkuzey.multiLayeredDemo.entities.concretes.Product;

import java.util.List;

public class NewDBDao implements ProductDao {
    @Override
    public void add(Product product) {
        System.out.println("Updated with NewDB, Product id:" + product.getId());

    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public void update(Product product) {

    }

    @Override
    public Product get(int id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
