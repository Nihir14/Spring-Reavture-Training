package com.nihir.rev.reactiveprogramming;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class FluxDemo {
    public static void main(String[] args) {
        Flux<Integer> flux = Flux.just(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        flux.subscribe(System.out::println);

        Flux.just(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).map(i -> i*2).subscribe(System.out::println);

        Flux.just(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(i -> i> 3).subscribe(System.out::println);

        Flux.just("A", "B").flatMap(s -> Mono.just(s.toLowerCase())).subscribe(System.out::println);
    }
}
