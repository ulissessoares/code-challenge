package com.ulisses.faire.challenge;

import com.ulisses.faire.challenge.business.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;

@SpringBootApplication
public class Application {

	private static List<String> args;

	@Autowired
	ProductService productService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@PostConstruct
	public void consumeProducts(){
		productService.consumeAllProducts();
	}
}
