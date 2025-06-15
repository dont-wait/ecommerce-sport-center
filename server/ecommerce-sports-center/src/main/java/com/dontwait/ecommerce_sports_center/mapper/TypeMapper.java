package com.dontwait.ecommerce_sports_center.mapper;

import com.dontwait.ecommerce_sports_center.dto.response.TypeResponse;
import com.dontwait.ecommerce_sports_center.entity.Type;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TypeMapper {
    TypeResponse toTypeResponse(Type type);
}
