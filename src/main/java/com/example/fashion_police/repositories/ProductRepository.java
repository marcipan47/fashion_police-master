package com.example.fashion_police.repositories;

import com.example.fashion_police.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findFirstBySexAndCollectionAndTypeAndStyleAndColor(String sex, String collection, String type, String style, String color);
}
