package com.dontwait.ecommerce_sports_center.service;

import com.dontwait.ecommerce_sports_center.dto.response.ProductResponse;

import java.util.List;

public interface ProductService {
    List<ProductResponse> getProducts();
    ProductResponse findById(Integer id);
}
