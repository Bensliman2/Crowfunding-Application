package ma.fstt.lsi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.fstt.lsi.entities.GameCat;
import ma.fstt.lsi.repositories.GameCatRepository;



@Service
public class GameCatService implements BaseRestService<GameCat, Long> {

	@Autowired
	private GameCatRepository repository ;
	
	
	@Override
	public List<GameCat> getAll() {
		List<GameCat> GameCats = new ArrayList<>();
		repository.findAll().forEach(GameCats::add);
		return GameCats;
	}

	@Override
	public GameCat get(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public GameCat create(GameCat resource) {
		return repository.save(resource);
		
	}

	@Override
	public GameCat update(Long id, GameCat resource) {
		resource.setId_cat(id);
		return repository.save(resource);	
		
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}

	
	

}
