package com.nihir.rev.qualifierannotation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Qualifier;

@Configuration
public class AppConfig {

    @Bean("creditPayment")
    public PaymentService creditPayment() {
        return new CreditCardPaymentService();
    }

    @Bean("upiPayment")
    public PaymentService upiPayment() {
        return new UpiPaymentService();
    }

    @Bean
    public OrderService orderService(
            @Qualifier("upiPayment") PaymentService paymentService) {
        return new OrderService(paymentService);
    }
}
