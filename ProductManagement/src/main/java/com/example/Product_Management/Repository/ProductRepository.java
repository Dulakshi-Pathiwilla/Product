package com.example.Product_Management.Repository;


import com.example.Product_Management.DTO.ProductDTO;
import com.example.Product_Management.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {


    List<Product> findByProductNameIgnoreCase(String productName);
    List<Product> findByCategoryIgnoreCase(String category);
    void deleteByProductName(String productName);
}
