package com.codingdojo.holamundo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HolaMundoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolaMundoApplication.class, args);
	}
	
	// 1. Anotación
    @RequestMapping("/")
    // 3. Método que se asigna a la Solicitud anterior.
    public String hello() { // 3
            return "Hello client! How are you doing?";
    }
    
    @RequestMapping("/random")
    public String random() { 
            return "Spring Boot is great! So easy to just respond with strings";
    }

}
