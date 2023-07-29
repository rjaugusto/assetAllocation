package com.rja.assetAllocation.trasaction.repository;

import com.rja.assetAllocation.trasaction.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}