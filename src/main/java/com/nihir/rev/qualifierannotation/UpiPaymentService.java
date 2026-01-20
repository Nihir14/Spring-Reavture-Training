package com.nihir.rev.qualifierannotation;

public class UpiPaymentService implements PaymentService {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}
