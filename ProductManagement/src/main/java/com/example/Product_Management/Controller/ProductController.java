package com.example.Product_Management.Controller;

import com.example.Product_Management.DTO.ProductDTO;
import com.example.Product_Management.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/addNew")
    public ProductDTO newNewProduct(@RequestBody ProductDTO productDTO){
        return productService.addNewProduct(productDTO);
    }

    @GetMapping("/all")
    public List<ProductDTO> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/search/{productName}")
    public List<ProductDTO> search(@PathVariable("productName") String productName){
        return productService.search(productName);
    }

    @DeleteMapping("/delete/{productName}")
    public ResponseEntity<String> deleteProduct(@PathVariable("productName")String productName){
        productService.deleteByProductName(productName);
        return ResponseEntity.ok(productName + "deleted successfully.");
    }

}
