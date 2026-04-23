package com.veracode.iast.samples.apigoat;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {

    private static final String template = "Hello, %s!";

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/hello")
	String test(@RequestParam(value="name", defaultValue="undefined") String param) {
		return String.format(template, param);
	}
}
