package com.example.Product.Service;

import com.example.Product.DTO.ProductDTO;
import com.example.Product.Entity.Product;

import java.util.List;

public interface ProductService {
    ProductDTO addProduct(ProductDTO productDTO);
    List<ProductDTO>  getAllProducts();
    List<ProductDTO> searchProducts(String productName);
    void deleteProductByName(String productName);
}
