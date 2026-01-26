package com.nhannguyenh.simpleshop.repository;

import com.nhannguyenh.simpleshop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
