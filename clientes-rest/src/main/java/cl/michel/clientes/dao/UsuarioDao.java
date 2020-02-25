package cl.michel.clientes.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import cl.michel.clientes.model.Usuario;



@RepositoryRestResource(path = "usuarios")
public interface UsuarioDao extends PagingAndSortingRepository<Usuario, Long>{
	
	@RestResource(path = "buscarNombre")
	public Usuario findByUsername(@Param("nombre") String username);

}
