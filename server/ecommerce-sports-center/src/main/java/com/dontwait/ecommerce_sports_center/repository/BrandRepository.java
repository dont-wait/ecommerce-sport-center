package com.dontwait.ecommerce_sports_center.repository;

import com.dontwait.ecommerce_sports_center.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {
}
