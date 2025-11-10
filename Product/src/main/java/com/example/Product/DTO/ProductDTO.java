package com.example.Product.DTO;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDTO {

    @NotBlank(message = "Product Name cannot be empty")
    private String productName;

    @NotBlank(message = "Product Category cannot be empty")
    private String category;

    @Min(value = 1, message="Quantity can only be positive")
    private int quantity;

    @Min(value = 1, message="Price can only be positive")
    private double price;

    public ProductDTO(String name,String type,int count, double pricing){
        this.productName = name;
        this.category = type;
        this.quantity = count;
        this.price = pricing;
    }
}
