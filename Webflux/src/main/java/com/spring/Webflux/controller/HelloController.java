package com.spring.Webflux.controller;

import org.reactivestreams.Publisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class HelloController {

	@GetMapping
	@ResponseBody
	public Publisher<String> SayHello() {
	return	Mono.just("Teste com mono de 0, 1 ");
	}
}
