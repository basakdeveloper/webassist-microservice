package com.pearson.webassist.demoserviceb.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pearson.webassist.demoserviceb.model.InventoryItem;
import com.pearson.webassist.demoserviceb.repositories.InventoryItemRepository;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class InventoryController {
	
	private final InventoryItemRepository inventoryItemRepository;

	@Autowired
	public InventoryController(InventoryItemRepository inventoryItemRepository) {
		this.inventoryItemRepository = inventoryItemRepository;
	}

	@GetMapping("/api/inventory/{productCode}")
	public ResponseEntity<InventoryItem> findInventoryByProductCode(@PathVariable("productCode") String productCode) {
		Optional<InventoryItem> inventoryItem = inventoryItemRepository.findByProductCode(productCode);
		if (inventoryItem.isPresent()) {
			return new ResponseEntity(inventoryItem, HttpStatus.OK);
		} else {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/api/inventory")
	public List<InventoryItem> getInventory() {
		return inventoryItemRepository.findAll();
	}
}
