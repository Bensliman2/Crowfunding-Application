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
import ma.fstt.lsi.entities.GameCat;
import ma.fstt.lsi.services.GameCatService;


@RestController
@CrossOrigin("*")
public class GameCatController implements BaseRestController<GameCat, Long> {

	
	@Autowired
	private GameCatService service;
	
	@RequestMapping(method = RequestMethod.GET, value ="/GameCats")
	public List<GameCat> getAll() {
		// TODO Auto-generated method stub
		return service.getAll();
	}

	@RequestMapping(method = RequestMethod.GET, value ="/GameCats/{id}")
	public GameCat get(@PathParam ("id") Long id) {
		// TODO Auto-generated method stub
		return service.get(id);
	}

	@RequestMapping(method = RequestMethod.POST, value ="/GameCats")
	public GameCat create(@RequestBody GameCat resource) {
		// TODO Auto-generated method stub
		return service.create(resource);
	}

	@RequestMapping(method = RequestMethod.PUT, value ="/GameCats/{id}")
	public GameCat update(@PathVariable("id")Long id, @RequestBody GameCat resource) {
		// TODO Auto-generated method stub
		return service.update(id, resource);
	}

	@RequestMapping(method = RequestMethod.DELETE, value ="/GameCats/{id}")
	public void delete(@PathParam("id")Long id) {
		// TODO Auto-generated method stub
		service.delete(id);
	}

}
