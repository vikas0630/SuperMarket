package com.example.supermarket.dao;

import com.example.supermarket.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDAO extends CrudRepository<Product,Integer> {
    @Override
    List<Product> findAll();


}
