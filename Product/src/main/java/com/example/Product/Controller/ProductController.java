package com.example.Product.Controller;

import com.example.Product.DTO.ProductDTO;
import com.example.Product.Entity.Product;
import com.example.Product.Service.Impl.ProductServiceImpl;
import com.example.Product.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/addProduct")
    public ProductDTO addProduct(@RequestBody ProductDTO productDTO){
        return productService.addProduct(productDTO);
    }

    @GetMapping("/getProducts")
    public List<ProductDTO> getProducts(){
        return productService.getAllProducts();
    }
}
