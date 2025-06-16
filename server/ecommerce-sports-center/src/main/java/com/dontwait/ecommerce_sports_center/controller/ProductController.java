package com.dontwait.ecommerce_sports_center.controller;

import com.dontwait.ecommerce_sports_center.dto.request.ProductSearchRequest;
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
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
    ApiResponse<List<ProductResponse>> getProducts(
            @RequestParam(name = "page", defaultValue = "0" ) int page,
            @RequestParam(name = "size", defaultValue = "10") int size,
            @RequestBody ProductSearchRequest request) {

        Sort.Direction direction = request.getOrder()
                .equalsIgnoreCase("desc") ?
                                            Sort.Direction.DESC :
                                            Sort.Direction.ASC;
        //Sort sorting = Sort.by(direction, request.getSort());

        Pageable pageable = PageRequest.of(page, size, Sort.by(direction, request.getSort()));

        return ApiResponse.<List<ProductResponse>>builder()
                .result(productService.getProducts(pageable, request))
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
