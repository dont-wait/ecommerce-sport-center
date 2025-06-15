package com.dontwait.ecommerce_sports_center.service.impl;

import com.dontwait.ecommerce_sports_center.dto.response.ProductResponse;
import com.dontwait.ecommerce_sports_center.mapper.ProductMapper;
import com.dontwait.ecommerce_sports_center.repository.ProductRepository;
import com.dontwait.ecommerce_sports_center.service.ProductService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    ProductRepository productRepository;
    ProductMapper productMapper;

    @Override
    public List<ProductResponse> getProducts() {
        return List.of();
    }

    @Override
    public ProductResponse findById(Integer id) {
        return null;
    }
}
