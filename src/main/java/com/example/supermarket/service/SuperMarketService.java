package com.example.supermarket.service;

import com.example.supermarket.dao.ProductDAO;
import com.example.supermarket.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Filter;

@Component

public class SuperMarketService {

    @Autowired
    private ProductDAO productDAO;
    private int productIdCount=1;

    public Product addProduct(Product product){
        return productDAO.save(product);
    }
    public List<Product> getProductList(){

        return productDAO.findAll();
    }

    public Product getProduct(int pid){
        // return productList
        return    productDAO.findById(pid).get();
    }
    public Product updateProduct(int pid, Product product){
        product.setPid(pid);
        return productDAO.save(product);
    }

    public void deleteProduct(int pid){
        productDAO.deleteById(pid);
    }
}
