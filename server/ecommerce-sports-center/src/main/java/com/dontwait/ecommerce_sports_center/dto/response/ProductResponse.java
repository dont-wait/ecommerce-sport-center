package com.dontwait.ecommerce_sports_center.dto.response;

import com.dontwait.ecommerce_sports_center.entity.Brand;
import com.dontwait.ecommerce_sports_center.entity.Type;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductResponse {
    Integer id;
    String name;
    String description;
    Long price;
    String pictureUrl;
    String productBrand;
    String productType;
}
