package com.dontwait.ecommerce_sports_center.dto.request;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class ProductSearchRequest {
    String keyword;
    Integer brandId;
    Integer typeId;
    String sort = "name";
    String order = "desc";
}
