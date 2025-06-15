package com.dontwait.ecommerce_sports_center.service.impl;

import com.dontwait.ecommerce_sports_center.dto.response.BrandResponse;
import com.dontwait.ecommerce_sports_center.mapper.BrandMapper;
import com.dontwait.ecommerce_sports_center.repository.BrandRepository;
import com.dontwait.ecommerce_sports_center.service.BrandService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class BrandServiceImpl implements BrandService {

    BrandRepository brandRepository;
    BrandMapper brandMapper;

    @Override
    public List<BrandResponse> findAll() {
        return brandRepository.findAll()
                .stream()
                .map(brandMapper::toResponse).toList();
    }
}
