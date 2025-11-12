package com.example.Product_Management.Service.Impl;

import com.example.Product_Management.DTO.ProductDTO;
import com.example.Product_Management.Entity.Product;
import com.example.Product_Management.Repository.ProductRepository;
import com.example.Product_Management.Service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ProductDTO addNewProduct(ProductDTO productDTO){
        Product product = modelMapper.map(productDTO, Product.class);
        Product saved = productRepository.save(product);
        return modelMapper.map(saved,ProductDTO.class);
    }

    @Override
    public List<ProductDTO> getAllProducts(){
        return productRepository.findAll().stream().map(product ->modelMapper.map(product, ProductDTO.class)).collect(Collectors.toList());

    }

    @Override
    public List<ProductDTO> search(String productName){
        return productRepository.findByProductNameIgnoreCase(productName).stream().map(product -> modelMapper.map(product,ProductDTO.class)).collect(Collectors.toList() );

    }

    @Override
    public void deleteByProductName(String productName){
        productRepository.deleteByProductName(productName);
    }
}
