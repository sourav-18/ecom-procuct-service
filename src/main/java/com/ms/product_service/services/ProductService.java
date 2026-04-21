package com.ms.product_service.services;

import com.ms.product_service.domins.Product;
import com.ms.product_service.domins.dtos.ProductIsValidRequestDto;
import com.ms.product_service.domins.dtos.ProductPriceRequestDto;
import com.ms.product_service.domins.dtos.ProductPriceResponseDto;
import com.ms.product_service.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public Boolean isValidProduct(ProductIsValidRequestDto request){
       List<Product> products= productRepository.findByIdIn(request.getIds());
       return products.size()==request.getIds().size();
    }

    public Object getProductPrice(ProductPriceRequestDto request){
       List<ProductPriceResponseDto> productPrice=productRepository.findByIdIn(request.getIds()).stream()
                .map((item)->new ProductPriceResponseDto(item.getId(), item.getPrice()))
                .toList();
       return productPrice;
    }
}
