package ma.fstt.lsi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.fstt.lsi.entities.Donation;
import ma.fstt.lsi.repositories.DonationRepository;

@Service
public class DonationService  implements BaseRestService<Donation, Long> {
	@Autowired
	private DonationRepository repository ;
	
	
	@Override
	public List<Donation> getAll() {
		List<Donation> Donations = new ArrayList<>();
		repository.findAll().forEach(Donations::add);;
		return Donations;
	}

	@Override
	public Donation get(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public Donation create(Donation resource) {
		return repository.save(resource);
		
	}

	@Override
	public Donation update(Long id, Donation resource) {
		resource.setId_donation(id);;
		return repository.save(resource);	
		
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}

	
}
