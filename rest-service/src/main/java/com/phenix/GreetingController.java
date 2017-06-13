package com.phenix;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class GreetingController {
    private final AtomicInteger atomicInteger = new AtomicInteger();
    private final String template = "Hello, %s";


    @GetMapping(value = "/greeting")
    public Greeting greeting(@RequestParam(value = "name",defaultValue = "World") String name) {
        return new Greeting(atomicInteger.getAndIncrement(), String.format(template, name));
    }
}
