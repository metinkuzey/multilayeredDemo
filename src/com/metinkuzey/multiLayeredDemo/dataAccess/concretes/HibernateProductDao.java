package com.metinkuzey.multiLayeredDemo.dataAccess.concretes;

import com.metinkuzey.multiLayeredDemo.dataAccess.abstracts.ProductDao;
import com.metinkuzey.multiLayeredDemo.entities.concretes.Product;

import java.util.List;

public class HibernateProductDao implements ProductDao {

    @Override
    public void add(Product product) {
        System.out.println("Added with Hibernate, Product id:" + product.getId());
    }

    @Override
    public void delete(Product product) {
        System.out.println("Deleted with Hibernate, Product id:" + product.getId());

    }

    @Override
    public void update(Product product) {

        System.out.println("Updated with Hibernate, Product id:" + product.getId());
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
