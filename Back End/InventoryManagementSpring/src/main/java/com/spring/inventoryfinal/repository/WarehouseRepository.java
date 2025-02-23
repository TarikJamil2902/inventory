package com.spring.inventoryfinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.inventoryfinal.entity.Warehouse;

public interface WarehouseRepository extends JpaRepository<Warehouse, Long>{

}
