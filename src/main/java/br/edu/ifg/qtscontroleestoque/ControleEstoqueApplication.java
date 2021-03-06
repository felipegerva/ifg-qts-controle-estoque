package br.edu.ifg.qtscontroleestoque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = "br.edu.ifg.qtscontroleestoque.entity")
@ComponentScan(basePackages = "br.edu.ifg.qtscontroleestoque.*")
public class ControleEstoqueApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleEstoqueApplication.class, args);
	}

}
