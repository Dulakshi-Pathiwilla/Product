package com.example.Product.DTO;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductDTO {

    @NotBlank(message="Product Name cannot be empty.")
    private String productName;

    @NotBlank(message="Category cannot be empty.")
    private String category;

    @Min(value=1,message = "Price should be at least one")
    private double price;

    @Min(value=1,message="Amount should be greater than 1")
    private int amount;

}
