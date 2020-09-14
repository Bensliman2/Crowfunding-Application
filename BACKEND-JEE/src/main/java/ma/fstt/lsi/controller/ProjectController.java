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
import ma.fstt.lsi.entities.Project;
import ma.fstt.lsi.services.ProjectService;


@RestController
@CrossOrigin("*")
public class ProjectController implements BaseRestController<Project, Long> {

	
	@Autowired
	private ProjectService service;
	
	@RequestMapping(method = RequestMethod.GET, value ="/Projects")
	public List<Project> getAll() {
		// TODO Auto-generated method stub
		return service.getAll();
	}

	@RequestMapping(method = RequestMethod.GET, value ="/Projects/{id}")
	public Project get(@PathParam ("id") Long id) {
		// TODO Auto-generated method stub
		return service.get(id);
	}

	@RequestMapping(method = RequestMethod.POST, value ="/Projects")
	public Project create(@RequestBody Project resource) {
		// TODO Auto-generated method stub
		 return service.create(resource);
	}

	@RequestMapping(method = RequestMethod.PUT, value ="/Projects/{id}")
	public Project update(@PathVariable("id")Long id, @RequestBody Project resource) {
		// TODO Auto-generated method stub
		return  service.update(id, resource);
	}

	@RequestMapping(method = RequestMethod.DELETE, value ="/Projects/{id}")
	public void delete(@PathParam("id")Long id) {
		// TODO Auto-generated method stub
		service.delete(id);
	}

}
