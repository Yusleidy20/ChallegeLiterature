package com.Alura.ChallegeLiteratura;

import com.Alura.ChallegeLiteratura.Principal.Principal;
import com.Alura.ChallegeLiteratura.Repository.AutorRepository;
import com.Alura.ChallegeLiteratura.Repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallegeLiteraturaApplication {
	@Autowired
	private AutorRepository repositorioAutores;
	@Autowired
	private LibroRepository repositorioLibros;

	public static void main(String[] args) {
		SpringApplication.run(ChallegeLiteraturaApplication.class, args);
	}

	public void run(String... args) throws Exception {
		Principal principal = new Principal(repositorioAutores, repositorioLibros);
		principal.muestraMenu();
	}

}
