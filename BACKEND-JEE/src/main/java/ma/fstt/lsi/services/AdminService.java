package ma.fstt.lsi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import ma.fstt.lsi.entities.Admin;
import ma.fstt.lsi.repositories.AdminRepository;

@Service
public class AdminService implements BaseRestService<Admin, Long>, UserDetailsService{
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public List<Admin> getAll() {
		List<Admin> Admins = new ArrayList<>();
		adminRepository.findAll().forEach(Admins::add);
		return Admins;
	}

	@Override
	public Admin get(Long id) {
		return adminRepository.findById(id).get();
	}

	@Override
	public Admin create(Admin resource) {
		return adminRepository.save(resource);
	}

	@Override
	public Admin update(Long id, Admin resource) {
		resource.setId(id);
		return adminRepository.save(resource);
	}

	@Override
	public void delete(Long id) {
		adminRepository.deleteById(id);
		
	}

	public UserDetails getAdminByEmail(String email) {
		return adminRepository.findByEmail(email);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return getAdminByEmail(username);
	}
	

}
