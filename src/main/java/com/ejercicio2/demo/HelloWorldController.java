package com.ejercicio2.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/")
    public String helloWorld() {
        return "hola tere";
    }
}
