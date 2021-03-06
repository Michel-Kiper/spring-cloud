package cl.michel.clientes.dao;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import cl.michel.clientes.model.Rol;
import cl.michel.clientes.model.Usuario;


@Configuration
public class RepositoryConfiguration implements RepositoryRestConfigurer{

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Usuario.class,Rol.class);
	}

	
}
