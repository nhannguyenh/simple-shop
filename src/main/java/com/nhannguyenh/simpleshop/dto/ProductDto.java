package com.nhannguyenh.simpleshop.dto;

import lombok.Builder;

import java.time.ZonedDateTime;

@Builder
public class ProductDto {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String sku;
    private String createdBy;
    private ZonedDateTime createdOn;
    private String modifiedBy;
    private ZonedDateTime modifiedOn;
}