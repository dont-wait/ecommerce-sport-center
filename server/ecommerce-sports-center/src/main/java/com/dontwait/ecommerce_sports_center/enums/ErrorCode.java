package com.dontwait.ecommerce_sports_center.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum ErrorCode {

    UNCATEGORIZED_EXCEPTION(6789, "Uncategorized error", HttpStatus.INTERNAL_SERVER_ERROR),
    INVALID_KEY(1001, "Uncategorized error", HttpStatus.BAD_REQUEST), //sai thuoc tinh,
    PRODUCT_ID_NOTFOUND(1002, "Product id not found", HttpStatus.NOT_FOUND),
    ;

    Integer code;
    String message;
    HttpStatus httpStatus;
}
