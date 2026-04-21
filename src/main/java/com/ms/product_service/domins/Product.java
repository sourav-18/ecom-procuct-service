package com.ms.product_service.domins;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class Product {

    @Id
    private String id;
    private String title;
    private String description;
    private String imageUrl;
    private Integer price;
    private Integer quantity;
}
