package com.nihir.rev.reactiveprogramming;

import reactor.core.publisher.Mono;

public class MonoDemo {
    public static void main(String[] args) {
//        create a publisher which holds the data "Hello Reactor"
//        no execution happens -- lazy behavior
        Mono<String> mono = Mono.just("Hello Reactor");

//        this is subscriber
//        it has 3 callbacks (onNext, onError, onComplete)
//        onNext -- called when mono emits data
//        onError -- called when error occurs
//        onComplete -- called after data is emitted successfully
        mono.subscribe(data -> System.out.println("Received : " + data),
                error -> System.out.println("Error : " + error),
                () -> System.out.println("Completed"));

        Mono.just(5).map(i -> i * 2).subscribe(System.out::println);
    }
}
