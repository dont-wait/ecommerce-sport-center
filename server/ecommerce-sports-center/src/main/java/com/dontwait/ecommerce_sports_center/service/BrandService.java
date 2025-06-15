package com.dontwait.ecommerce_sports_center.service;

import com.dontwait.ecommerce_sports_center.dto.response.BrandResponse;

import java.util.List;

public interface BrandService {
    List<BrandResponse> findAll();
}
