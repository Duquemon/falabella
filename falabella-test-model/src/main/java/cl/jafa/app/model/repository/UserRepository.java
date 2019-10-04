package cl.jafa.app.model.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import cl.jafa.app.model.entities.User;

@RepositoryRestResource(path="users")
public interface UserRepository extends PagingAndSortingRepository<User, Long>{
	public User findByUsername(String username);

}
