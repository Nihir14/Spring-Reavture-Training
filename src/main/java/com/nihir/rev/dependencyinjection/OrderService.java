package com.nihir.rev.dependencyinjection;

public class OrderService {

    private final PaymentGateway paymentGateway;

    // Constructor Injection
    public OrderService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void placeOrder(double amount) {
        System.out.println("Placing order...");
        paymentGateway.pay(amount);
        System.out.println("Order placed successfully");
    }
}
