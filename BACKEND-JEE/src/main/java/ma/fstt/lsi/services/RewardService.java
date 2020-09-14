package ma.fstt.lsi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.fstt.lsi.entities.Reward;
import ma.fstt.lsi.repositories.RewardRepository;



@Service
public class RewardService implements BaseRestService<Reward, Long> {

	@Autowired
	private RewardRepository repository ;
	
	
	@Override
	public List<Reward> getAll() {
		List<Reward> Rewards = new ArrayList<>();
		repository.findAll().forEach(Rewards::add);
		return Rewards;
	}

	@Override
	public Reward get(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public Reward create(Reward resource) {
		return repository.save(resource);
		
	}

	@Override
	public Reward update(Long id, Reward resource) {
		resource.setId_reward(id);
		return repository.save(resource);	
		
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}

	
	

}
