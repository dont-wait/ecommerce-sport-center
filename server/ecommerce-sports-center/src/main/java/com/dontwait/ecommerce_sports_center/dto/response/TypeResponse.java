package com.dontwait.ecommerce_sports_center.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TypeResponse {
    Integer id;
    String name;
}
