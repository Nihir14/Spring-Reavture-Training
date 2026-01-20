package com.nihir.rev.qualifierannotation;

public class CreditCardPaymentService implements PaymentService {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}
