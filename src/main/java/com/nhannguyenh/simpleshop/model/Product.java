package com.nhannguyenh.simpleshop.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.ZonedDateTime;

@Entity
@Table(name = "products")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String sku;
    private String createdBy;
    private ZonedDateTime createdOn;
    private String modifedBy;
    private ZonedDateTime modidiedOn;
}
