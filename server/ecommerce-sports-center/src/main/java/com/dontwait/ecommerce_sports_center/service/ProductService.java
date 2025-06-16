package com.dontwait.ecommerce_sports_center.service;

import com.dontwait.ecommerce_sports_center.dto.request.ProductSearchRequest;
import com.dontwait.ecommerce_sports_center.dto.response.ProductResponse;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {
    List<ProductResponse> getProducts(Pageable pageable, ProductSearchRequest request);
    ProductResponse findById(Integer id);
}
