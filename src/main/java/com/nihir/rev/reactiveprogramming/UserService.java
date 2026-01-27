package com.nihir.rev.reactiveprogramming;

import reactor.core.publisher.Mono;

public class UserService {
    public Mono<String> findUser() {
        return Mono.just("Hello");
    }
}
