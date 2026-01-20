package com.nihir.rev.dependencyinjection;

public class PaymentGateway {

    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " processed successfully");
    }
}
