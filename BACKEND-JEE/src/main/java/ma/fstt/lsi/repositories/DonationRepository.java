package ma.fstt.lsi.repositories;

import org.springframework.data.repository.CrudRepository;

import ma.fstt.lsi.entities.Donation;

public interface DonationRepository extends CrudRepository<Donation, Long> {

}
