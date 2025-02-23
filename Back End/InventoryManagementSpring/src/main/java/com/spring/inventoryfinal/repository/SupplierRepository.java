package com.spring.inventoryfinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.spring.inventoryfinal.entity.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Long>{
	
	
	 @Query(value = "SELECT * FROM supplier t WHERE  t.supplier_name = :suppliername ", nativeQuery = true)
     Supplier supplierdata(@Param("suppliername") String name);

}
