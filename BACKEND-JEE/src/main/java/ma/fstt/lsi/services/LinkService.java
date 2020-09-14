package ma.fstt.lsi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.fstt.lsi.entities.Link;
import ma.fstt.lsi.repositories.LinkRepository;



@Service
public class LinkService implements BaseRestService<Link, Long> {

	@Autowired
	private LinkRepository repository ;
	
	
	@Override
	public List<Link> getAll() {
		List<Link> Links = new ArrayList<>();
		repository.findAll().forEach(Links::add);
		return Links;
	}

	@Override
	public Link get(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public Link create(Link resource) {
		return repository.save(resource);
		
	}

	@Override
	public Link update(Long id, Link resource) {
		resource.setId_link(id);
		return repository.save(resource);	
		
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}

	
	

}
