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
import ma.fstt.lsi.entities.Reward;
import ma.fstt.lsi.services.RewardService;


@RestController
@CrossOrigin("*")
public class RewardController implements BaseRestController<Reward, Long> {

	
	@Autowired
	private RewardService service;
	
	@RequestMapping(method = RequestMethod.GET, value ="/Rewards")
	public List<Reward> getAll() {
		// TODO Auto-generated method stub
		return service.getAll();
	}

	@RequestMapping(method = RequestMethod.GET, value ="/Rewards/{id}")
	public Reward get(@PathParam ("id") Long id) {
		// TODO Auto-generated method stub
		return service.get(id);
	}

	@RequestMapping(method = RequestMethod.POST, value ="/Rewards")
	public Reward create(@RequestBody Reward resource) {
		// TODO Auto-generated method stub
		 return service.create(resource);
	}

	@RequestMapping(method = RequestMethod.PUT, value ="/Rewards/{id}")
	public Reward update(@PathVariable("id")Long id, @RequestBody Reward resource) {
		// TODO Auto-generated method stub
		 return service.update(id, resource);
	}

	@RequestMapping(method = RequestMethod.DELETE, value ="/Rewards/{id}")
	public void delete(@PathParam("id")Long id) {
		// TODO Auto-generated method stub
		service.delete(id);
	}

}
