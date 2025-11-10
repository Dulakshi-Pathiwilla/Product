package com.example.Product.Service;

import com.example.Product.DTO.ProductDTO;
import com.example.Product.Entity.Product;

public class Mapper {

    public static Product toEntity(ProductDTO dto){
        return new Product(
                dto.getProductName(),
                dto.getCategory(),
                dto.getQuantity(),
                dto.getPrice()
        );
    }

    public static ProductDTO toDTO(Product entity) {
        return new ProductDTO(
                entity.getProductName(),
                entity.getCategory(),
                entity.getQuantity(),
                entity.getPrice()
        );
    }
}
