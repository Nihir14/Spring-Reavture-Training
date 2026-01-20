package com.nihir.rev.diexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public PaymentGateway paymentGateway() {
        return new PaymentGateway();
    }

    @Bean
    public OrderService orderService() {
        return new OrderService(paymentGateway());
    }
}
