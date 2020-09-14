package ma.fstt.lsi.repositories;

import org.springframework.data.repository.CrudRepository;

import ma.fstt.lsi.entities.User;

public interface UserRepository extends CrudRepository<User, String> {

}
