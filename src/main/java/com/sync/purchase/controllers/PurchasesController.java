package com.sync.purchase.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sync.purchase.models.Purchase;
import com.sync.purchase.repositories.PurchaseRepository;

@RestController
@RequestMapping("/api/v1/purchases")
public class PurchasesController {
	
	@Autowired
	private PurchaseRepository purchaseRepository;
	
	@GetMapping
	public List<Purchase> list() {
		return purchaseRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create (@RequestBody Purchase purchase) {
		purchaseRepository.save(purchase);
		
	}
	
	@GetMapping("/{id}")
	public Purchase get(@PathVariable("id") long id) {
		return purchaseRepository.getOne(id);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable long id) {
		purchaseRepository.deleteById(id);
		
	}
	
}
