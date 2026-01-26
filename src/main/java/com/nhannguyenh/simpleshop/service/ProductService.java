package com.nhannguyenh.simpleshop.service;

import com.nhannguyenh.simpleshop.dto.ProductDto;
import com.nhannguyenh.simpleshop.model.Product;
import com.nhannguyenh.simpleshop.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDto> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products.stream()
                .map(this::mapToDto)
                .toList();
    }

    private ProductDto mapToDto(Product product) {
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
}
