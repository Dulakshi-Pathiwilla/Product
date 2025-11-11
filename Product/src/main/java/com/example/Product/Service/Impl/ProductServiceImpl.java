package com.example.Product.Service.Impl;

import com.example.Product.DTO.ProductDTO;
import com.example.Product.Entity.Product;
import com.example.Product.Repository.ProductRepository;
import com.example.Product.Service.ProductService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ModelMapper modelMapper;
    //Add Product
    public ProductDTO addProduct(ProductDTO productDTO){
        productRepository.save(modelMapper.map(productDTO,Product.class));
        return productDTO;
    }

    //Get All Products
    public List<ProductDTO> getAllProducts() {
        List<ProductDTO> productList = productRepository.findAll();
        return modelMapper.map(productList, new TypeToken<List<ProductDTO>>(){}.getType());
    }

    //Search Products by Product Name
    public List<Product> searchProducts(String productName){
        return productRepository.findAll(modelMapper.<Sort>map(productName, Product.class));
    }

    //Delete Products by Product Name
    public void deleteProductByName(String productName){
        productRepository.delete(modelMapper.map(productName, Product.class));
    }
    /*public List<UserDTO> getAllUsers(){
        List<User>userList=userRepo.findAll();
        return modelMapper.map(userList,new TypeToken<List<UserDTO>>(){}.getType());
    }*/

}
