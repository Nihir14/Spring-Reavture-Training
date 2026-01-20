package com.nihir.rev.qualifierannotation;

import org.springframework.beans.factory.annotation.Qualifier;

public class OrderService {

    private final PaymentService paymentService;

    public OrderService(@Qualifier("upiPayment") PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(double amount) {
        paymentService.pay(amount);
    }
}
