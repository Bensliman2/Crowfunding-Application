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
import ma.fstt.lsi.entities.Donation;
import ma.fstt.lsi.services.DonationService;


@RestController
@CrossOrigin("*")
public class DonationController implements BaseRestController<Donation, Long> {

	
	@Autowired
	private DonationService service;
	
	@RequestMapping(method = RequestMethod.GET, value ="/Donations")
	public List<Donation> getAll() {
		// TODO Auto-generated method stub
		return service.getAll();
	}

	@RequestMapping(method = RequestMethod.GET, value ="/Donations/{id}")
	public Donation get(@PathParam ("id") Long id) {
		// TODO Auto-generated method stub
		return service.get(id);
	}

	@RequestMapping(method = RequestMethod.POST, value ="/Donations")
	public Donation create(@RequestBody Donation resource) {
		// TODO Auto-generated method stub
		return service.create(resource);
	}

	@RequestMapping(method = RequestMethod.PUT, value ="/Donations/{id}")
	public Donation update(@PathVariable("id")Long id, @RequestBody Donation resource) {
		// TODO Auto-generated method stub
		return service.update(id, resource);
	}

	@RequestMapping(method = RequestMethod.DELETE, value ="/Donations/{id}")
	public void delete(@PathParam("id")Long id) {
		// TODO Auto-generated method stub
		service.delete(id);
	}

}
