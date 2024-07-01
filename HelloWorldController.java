package com.generation.helloworld.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping("/hello")
	public String helloworld() {
		return "Hello World!!!";
	}
	
	@GetMapping("/bsm")
    public List<String> bsmList() {
        return Arrays.asList("Mentalidade de Crescimento", "Responsabilidade Pessoal", "Orientação ao Futuro",
                "Persistência", "Comunicação", "Trabalho em Equipe", "Proatividade",
                "Orientação ao Detalhe");
    }

    @GetMapping("/objetivos")
    public List<String> learningObjectives() {
        return Arrays.asList("Aprender Spring Boot", "Praticar e prestar atenção aos detalhes", "Conhecer melhor o Insomnia",
                "Estudar boas práticas de desenvolvimento");
    }
}
