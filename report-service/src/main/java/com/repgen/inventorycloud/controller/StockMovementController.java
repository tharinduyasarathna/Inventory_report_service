package com.repgen.inventorycloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.repgen.inventorycloud.service.StockMovementServiceImpl;

@RestController
@CrossOrigin
@RequestMapping(value = "/report")
public class StockMovementController {

	@Autowired
	StockMovementServiceImpl stockMovementServiceImpl;
	@RequestMapping(value = "/stockmoment/{date}/{brandId}/{itemId}/{uomId}", method = RequestMethod.GET) 
	// fetch Stock Movement Report
	
	public ResponseEntity<?> fetchStockMovement(@PathVariable String date, @PathVariable Integer itemId,
			@PathVariable Integer uomId, @PathVariable Integer brandId) { 
		
			return stockMovementServiceImpl.fetchdetails(date, itemId, uomId, brandId);

	}
}
