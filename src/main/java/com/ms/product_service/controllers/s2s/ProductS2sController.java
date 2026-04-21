package com.ms.product_service.controllers.s2s;

import com.ms.product_service.domins.dtos.ProductIsValidRequestDto;
import com.ms.product_service.domins.dtos.ProductPriceRequestDto;
import com.ms.product_service.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

@RequiredArgsConstructor
@RestController
@RequestMapping("/s2s/products")
public class ProductS2sController {

    private final ProductService productService;

    @PostMapping("/is-valid")
    public Boolean isValid(@RequestBody ProductIsValidRequestDto request){
        return productService.isValidProduct(request);
    }

    @PostMapping("/price")
    public Object getProductPrice(@RequestBody ProductPriceRequestDto request){
        return productService.getProductPrice(request);
    }

}
