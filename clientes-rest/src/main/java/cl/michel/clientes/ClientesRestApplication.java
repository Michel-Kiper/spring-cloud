package cl.michel.clientes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
public class ClientesRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientesRestApplication.class, args);
	}

}
