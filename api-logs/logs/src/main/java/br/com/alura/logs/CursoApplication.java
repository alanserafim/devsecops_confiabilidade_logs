package br.com.alura.logs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursoApplication {
	
	private static Logger looger = LoggerFactory.getLogger(CursoApplication.class);

	public static void main(String[] args) {
		looger.info("Iniciando a API de cursos Alura");
		SpringApplication.run(CursoApplication.class, args);
		looger.info("API para cadastro de cursos na plataforma Alura");
	}
}
