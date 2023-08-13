package com.rja.assetAllocation.trasaction.controller;

import java.util.Arrays;
import java.util.List;

import com.rja.assetAllocation.trasaction.entities.Transaction;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RestController
@Data
@RequestMapping(path = "/transaction")
@RequiredArgsConstructor
public class TransactionController {
	
	@PostMapping
	public ResponseEntity<Transaction> inclui(@RequestBody Transaction transaction) {
		System.out.println(transaction.getQuantity());
		System.out.println(transaction.getPrice());
		System.out.println(transaction.getTransactionType());
		System.out.println(transaction.getAssetType());
		System.out.println(transaction.getTransactionDate());
		return new ResponseEntity<Transaction>(transaction,HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<Transaction> lista() {

		return Arrays.asList();
		
	}

}
