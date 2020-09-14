package ma.fstt.lsi.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ma.fstt.lsi.entities.User;
import ma.fstt.lsi.services.UserService;


@RestController
@CrossOrigin("*")
public class UserController implements BaseRestController<User, String> {

	
	@Autowired
	private UserService service;
	
	@RequestMapping(method = RequestMethod.GET, value ="/Users")
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return service.getAll();
	}

	@RequestMapping(method = RequestMethod.GET, value ="/Users/{id}")
	public User get(@PathParam ("id") String id) {
		// TODO Auto-generated method stub
		return service.get(id);
	}

	@RequestMapping(method = RequestMethod.POST, value ="/Users")
	public User create(@RequestBody User resource) {
		// TODO Auto-generated method stub
		return service.create(resource);
	}

	@RequestMapping(method = RequestMethod.PUT, value ="/Users/{id}")
	public User update(@PathVariable("id")String id, @RequestBody User resource) {
		// TODO Auto-generated method stub
		return  service.update(id, resource);
	}

	@RequestMapping(method = RequestMethod.DELETE, value ="/Users/{id}")
	public void delete(@PathParam("id")String id) {
		// TODO Auto-generated method stub
		service.delete(id);
	}

}
