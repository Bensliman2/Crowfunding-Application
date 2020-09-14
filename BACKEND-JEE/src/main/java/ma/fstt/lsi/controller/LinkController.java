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
import ma.fstt.lsi.entities.Link;
import ma.fstt.lsi.services.LinkService;


@RestController
@CrossOrigin("*")
public class LinkController implements BaseRestController<Link, Long> {

	
	@Autowired
	private LinkService service;
	
	@RequestMapping(method = RequestMethod.GET, value ="/Links")
	public List<Link> getAll() {
		// TODO Auto-generated method stub
		return service.getAll();
	}

	@RequestMapping(method = RequestMethod.GET, value ="/Links/{id}")
	public Link get(@PathParam ("id") Long id) {
		// TODO Auto-generated method stub
		return service.get(id);
	}

	@RequestMapping(method = RequestMethod.POST, value ="/Links")
	public Link create(@RequestBody Link resource) {
		// TODO Auto-generated method stub
		return service.create(resource);
	}

	@RequestMapping(method = RequestMethod.PUT, value ="/Links/{id}")
	public Link update(@PathVariable("id")Long id, @RequestBody Link resource) {
		// TODO Auto-generated method stub
		return service.update(id, resource);
	}

	@RequestMapping(method = RequestMethod.DELETE, value ="/Links/{id}")
	public void delete(@PathParam("id")Long id) {
		// TODO Auto-generated method stub
		service.delete(id);
	}

}
