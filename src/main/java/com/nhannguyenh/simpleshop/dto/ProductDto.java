package com.nhannguyenh.simpleshop.dto;

import lombok.Builder;

import java.time.ZonedDateTime;

@Builder
public record ProductDto(
        Long id,
        String name,
        String description,
        Double price,
        String sku,
        String createdBy,
        ZonedDateTime createdOn,
        String modifiedBy,
        ZonedDateTime modifiedOn
) {}