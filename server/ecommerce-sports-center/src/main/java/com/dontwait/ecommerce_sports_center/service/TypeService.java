package com.dontwait.ecommerce_sports_center.service;

import com.dontwait.ecommerce_sports_center.dto.response.TypeResponse;

import java.util.List;

public interface TypeService {
    List<TypeResponse> findAll();
}
