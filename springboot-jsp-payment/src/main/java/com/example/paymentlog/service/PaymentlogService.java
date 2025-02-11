// Service Class
package com.example.paymentlog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.paymentlog.repository.PaymentlogRepository;
import com.example.paymentlog.model.Paymentlog;
import java.util.List;

@Service
public class PaymentlogService {
    @Autowired
    private PaymentlogRepository repository;
    
    public List<Paymentlog> getAllPayments() {
        return repository.findAll();
    }
}
