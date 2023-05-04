package com.api.agendaGil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AgendaGilApplication {

	public static void main(String[] args) {

		SpringApplication.run(AgendaGilApplication.class, args);
	}
/*
	@GetMapping("/")
	public String index(){
		return "Jefferson da silva <br/>" +
				"amanhã tem Fernanda Pessoa! <br/>" +
				"não esqueça !!";
	}
 */
}
