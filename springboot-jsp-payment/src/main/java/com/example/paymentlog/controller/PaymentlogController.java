package com.example.paymentlog.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.paymentlog.service.PaymentlogService;

@Controller
public class PaymentlogController {
    @Autowired
    private PaymentlogService service;
    
    @GetMapping("/payments")
    public String listPayments(Model model) {
        model.addAttribute("payments", service.getAllPayments());
        return "payment-list";
    }
}