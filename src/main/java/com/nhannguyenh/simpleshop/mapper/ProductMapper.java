package com.nhannguyenh.simpleshop.mapper;

import com.nhannguyenh.simpleshop.dto.ProductDto;
import com.nhannguyenh.simpleshop.model.Product;

public class ProductMapper {

    public static ProductDto mapToDto(Product product) {
        return ProductDto.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .sku(product.getSku())
                .createdBy(product.getCreatedBy())
                .createdOn(product.getCreatedOn())
                .modifiedBy(product.getModifedBy())
                .modifiedOn(product.getModidiedOn())
                .build();
    }

    public static Product mapToProduct(ProductDto productDto) {
        return Product.builder()
                .id(productDto.getId())
                .name(productDto.getName())
                .description(productDto.getDescription())
                .price(productDto.getPrice())
                .sku(productDto.getSku())
                .createdBy(productDto.getCreatedBy())
                .createdOn(productDto.getCreatedOn())
                .modifedBy(productDto.getModifiedBy())
                .modidiedOn(productDto.getModifiedOn())
                .build();
    }
}
