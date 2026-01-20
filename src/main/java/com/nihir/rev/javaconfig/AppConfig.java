package com.nihir.rev.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Engine engine() {
        return new Engine();   // Spring creates & manages Engine object
    }

    @Bean
    public Car car() {
        return new Car(engine());  // Spring injects Engine into Car
    }
}
