package com.example.Product.Controller;

import com.example.Product.Entity.Product;
import com.example.Product.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/getProduct/{category}")
    public List<Product> getVehiclesByServiceYear(@PathVariable String category) {
        return productRepository.findByCategoryIgnoreCase(category);
    }
}
