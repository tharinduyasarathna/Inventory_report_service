package com.repgen.inventorycloud.service;

import org.springframework.http.ResponseEntity;

public interface StockMovementService {

	ResponseEntity<?> fetchdetails(Integer itemId,Integer uomId,Integer brandId);
}
