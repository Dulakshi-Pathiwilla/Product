package com.example.Product_Management.Service;

import com.example.Product_Management.DTO.ProductDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

   ProductDTO addNewProduct(ProductDTO productDTO);
   List<ProductDTO> getAllProducts();
   List<ProductDTO> search(String productName);
   void deleteByProductName(String productName);
}
