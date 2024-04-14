package com.picpaysimplificado.repositories;

import com.picpaysimplificado.domain.user.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
