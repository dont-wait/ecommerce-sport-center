package com.dontwait.ecommerce_sports_center.controller;

import com.dontwait.ecommerce_sports_center.dto.response.ApiResponse;
import com.dontwait.ecommerce_sports_center.dto.response.BrandResponse;
import com.dontwait.ecommerce_sports_center.dto.response.ProductResponse;
import com.dontwait.ecommerce_sports_center.dto.response.TypeResponse;
import com.dontwait.ecommerce_sports_center.service.BrandService;
import com.dontwait.ecommerce_sports_center.service.ProductService;
import com.dontwait.ecommerce_sports_center.service.TypeService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ProductController {

    BrandService brandService;
    TypeService typeService;
    ProductService productService;

    @GetMapping
    ApiResponse<List<ProductResponse>> getProducts() {
        return ApiResponse.<List<ProductResponse>>builder()
                .result(productService.getProducts())
                .message("success to get products")
                .build();
    }

    @GetMapping("/{id}")
    ApiResponse<ProductResponse> getProductById(@PathVariable Integer id) {
        return ApiResponse.<ProductResponse>builder()
                .result(productService.findById(id))
                .message("Success to get product by id")
                .build();
    }

    @GetMapping("/brands")
    ApiResponse<List<BrandResponse>> getBrands() {
        return ApiResponse.<List<BrandResponse>>builder()
                .result(brandService.findAll())
                .message("Success to get all brands")
                .build();
    }

    @GetMapping("/types")
    ApiResponse<List<TypeResponse>> getTypes() {
        return ApiResponse.<List<TypeResponse>>builder()
                .result(typeService.findAll())
                .message("Success to get all types")
                .build();
    }
}
