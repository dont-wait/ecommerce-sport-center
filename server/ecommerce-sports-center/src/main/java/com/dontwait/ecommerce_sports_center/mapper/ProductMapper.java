package com.dontwait.ecommerce_sports_center.mapper;

import com.dontwait.ecommerce_sports_center.dto.response.ProductResponse;
import com.dontwait.ecommerce_sports_center.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    //pass brand.name to productBrand
    @Mapping(source = "brand.name", target = "productBrand")
    @Mapping(source = "type.name", target = "productType")
    ProductResponse toProductResponse(Product product);
}
