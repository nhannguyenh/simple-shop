package com.nhannguyenh.simpleshop.service;

import com.nhannguyenh.simpleshop.dto.ProductDto;
import com.nhannguyenh.simpleshop.entity.Product;
import com.nhannguyenh.simpleshop.mapper.ProductMapper;
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
        return productRepository.findAll().stream()
                .map(ProductMapper::mapToDto)
                .toList();
    }

    public ProductDto getProductById(Long productId) {
        return productRepository.findById(productId)
                .map(ProductMapper::mapToDto)
                .orElseThrow();
    }

    public Product createProduct(ProductDto productDto) {
        return productRepository.save(ProductMapper.mapToProduct(productDto));
    }

}
