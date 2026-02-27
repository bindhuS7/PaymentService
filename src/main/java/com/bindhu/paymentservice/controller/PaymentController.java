package com.bindhu.paymentservice.controller;

import com.bindhu.paymentservice.dto.OrderRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/payment")
public class PaymentController {

    @PostMapping("/pay")
    public boolean pay(@RequestBody OrderRequest request) {

        System.out.println("Payment Successful for " + request.getAmount());
        return true;
    }

    @PostMapping("/refund")
    public void refund(@RequestBody OrderRequest request) {

        System.out.println("Refund Completed for " + request.getAmount());
    }
}