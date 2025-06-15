package com.dontwait.ecommerce_sports_center.service.impl;

import com.dontwait.ecommerce_sports_center.dto.response.TypeResponse;
import com.dontwait.ecommerce_sports_center.mapper.TypeMapper;
import com.dontwait.ecommerce_sports_center.repository.TypeRepository;
import com.dontwait.ecommerce_sports_center.service.TypeService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class TypeServiceImpl implements TypeService {

    TypeRepository typeRepository;
    TypeMapper typeMapper;

    @Override
    public List<TypeResponse> findAll() {
        return typeRepository.findAll()
                .stream()
                .map(typeMapper::toTypeResponse).toList();
    }
}
