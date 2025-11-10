package com.example.Product.Service;

import com.example.Product.Entity.Product;
import com.example.Product.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findByCategoryIgnoreCase(String category){
        return productRepository.findByCategoryIgnoreCase(category);
    }
}
