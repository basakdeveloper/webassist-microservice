package com.pearson.webassist.demoserviceb.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pearson.webassist.demoserviceb.model.InventoryItem;

public interface InventoryItemRepository extends JpaRepository<InventoryItem, Long> {

    Optional<InventoryItem> findByProductCode(String productCode);

}
