package com.metinkuzey.multiLayeredDemo;

import com.metinkuzey.multiLayeredDemo.business.abstracts.ProductService;
import com.metinkuzey.multiLayeredDemo.business.concretes.ProductManager;
import com.metinkuzey.multiLayeredDemo.core.LoggerService;
import com.metinkuzey.multiLayeredDemo.core.JLoggerManager3rdPartyAdapter;
import com.metinkuzey.multiLayeredDemo.dataAccess.concretes.NewDBDao;
import com.metinkuzey.multiLayeredDemo.entities.concretes.Product;

public class Main {
    public static void main(String[] args) {
        // ToDo: To solve with Spring IoC
        ProductService productService = new ProductManager(new NewDBDao(),new JLoggerManager3rdPartyAdapter());
        Product product = new Product(1,2,"Electronic","Speaker",150.00,100);
        productService.add(product);
    }
}
