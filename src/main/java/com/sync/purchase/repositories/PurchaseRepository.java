package com.sync.purchase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sync.purchase.models.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {

}
