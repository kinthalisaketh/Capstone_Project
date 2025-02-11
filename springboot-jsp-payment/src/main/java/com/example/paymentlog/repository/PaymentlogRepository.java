package com.example.paymentlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.paymentlog.model.Paymentlog;

public interface PaymentlogRepository extends JpaRepository<Paymentlog, Integer> {}