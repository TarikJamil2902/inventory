package com.spring.inventoryfinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.inventoryfinal.entity.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, Long>{
	

}
