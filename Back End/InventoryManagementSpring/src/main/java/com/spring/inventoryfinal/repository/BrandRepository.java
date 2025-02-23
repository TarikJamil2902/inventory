package com.spring.inventoryfinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.inventoryfinal.entity.Brand;

public interface BrandRepository extends JpaRepository<Brand, Long>{

}
