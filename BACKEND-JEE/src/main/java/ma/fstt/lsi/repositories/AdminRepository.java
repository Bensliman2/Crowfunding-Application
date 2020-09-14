package ma.fstt.lsi.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import ma.fstt.lsi.entities.Admin;

public interface AdminRepository extends CrudRepository<Admin, Long>{
	@Query("select a from Admin a where a.email = ?1")
	public Admin findByEmail(String email);

}
