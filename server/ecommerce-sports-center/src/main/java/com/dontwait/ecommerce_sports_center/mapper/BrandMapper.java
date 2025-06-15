package com.dontwait.ecommerce_sports_center.mapper;


import com.dontwait.ecommerce_sports_center.dto.response.BrandResponse;
import com.dontwait.ecommerce_sports_center.entity.Brand;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BrandMapper {
    BrandResponse toResponse(Brand brand);

}
