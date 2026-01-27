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
                .id(productDto.id())
                .name(productDto.name())
                .description(productDto.description())
                .price(productDto.price())
                .sku(productDto.sku())
                .createdBy(productDto.createdBy())
                .createdOn(productDto.createdOn())
                .modifedBy(productDto.modifiedBy())
                .modidiedOn(productDto.modifiedOn())
                .build();
    }
}
