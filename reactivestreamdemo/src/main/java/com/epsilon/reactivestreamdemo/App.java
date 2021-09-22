package com.epsilon.reactivestreamdemo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Flux<Integer> publisher = Flux.just(1,2,3,4,5,6);
    	
    	//Mono<Integer> publisher = Mono.just(2);
        
        publisher.map(x -> x*x).filter(x-> x%2==0).subscribe(System.out::println);
    }
}
