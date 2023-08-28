package com.rja.assetAllocation.trasaction.controller;

import com.rja.assetAllocation.trasaction.entities.BrazilianStock;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@Data
@RequestMapping(path = "/brazilianStock")
@RequiredArgsConstructor
public class BrazilianStockController {

    private List<BrazilianStock> brazilianStocks = new ArrayList<>();

    @PostMapping
    public ResponseEntity<BrazilianStock> inclui(@RequestBody BrazilianStock brazilianStock) {
        System.out.println(brazilianStock.getQuantity());
        System.out.println(brazilianStock.getPrice());
        System.out.println(brazilianStock.getTransactionType());
        System.out.println(brazilianStock.getTransactionDate());
        System.out.println(brazilianStock.getTax());
        System.out.println(brazilianStock.getTicker());

        brazilianStocks.add(brazilianStock);
        System.out.println(brazilianStocks.size());

        return new ResponseEntity<BrazilianStock>(brazilianStock, HttpStatus.CREATED);
    }

    @GetMapping
    public List<BrazilianStock> lista() {
        return this.brazilianStocks;

    }
}
