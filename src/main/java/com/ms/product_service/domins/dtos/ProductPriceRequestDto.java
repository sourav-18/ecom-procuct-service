package com.ms.product_service.domins.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class ProductPriceRequestDto {
    private Set<String> ids;
}
