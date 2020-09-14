package ma.fstt.lsi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.fstt.lsi.entities.User;
import ma.fstt.lsi.repositories.UserRepository;



@Service
public class UserService implements BaseRestService<User, String> {

	@Autowired
	private UserRepository repository ;
	
	
	@Override
	public List<User> getAll() {
		List<User> Users = new ArrayList<>();
		repository.findAll().forEach(Users::add);
		return Users;
	}

	@Override
	public User get(String id) {
		return repository.findById(id).get();
	}

	@Override
	public User create(User resource) {
		return repository.save(resource);
		
	}

	@Override
	public User update(String id, User resource) {
		resource.setEmail(id);
		return repository.save(resource);	
		
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);
		
	}

	
	

}
