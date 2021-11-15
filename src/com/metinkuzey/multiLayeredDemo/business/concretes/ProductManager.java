package com.metinkuzey.multiLayeredDemo.business.concretes;

import com.metinkuzey.multiLayeredDemo.business.abstracts.ProductService;
import com.metinkuzey.multiLayeredDemo.core.LoggerService;
import com.metinkuzey.multiLayeredDemo.dataAccess.abstracts.ProductDao;
import com.metinkuzey.multiLayeredDemo.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {

    private ProductDao productDao;
    private LoggerService loggerService;
    public ProductManager(ProductDao productDao, LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService = loggerService;
    }
    @Override
    public void add(Product product) {
        if (product.getCategoryId() == 1) {
            System.out.println("This category id does not approved.");
            return;
        }
        this.productDao.add(product);
        this.loggerService.logToSystem("");

    }

    @Override
    public List<Product> getAllProduct() {
        return null;
    }
}
