package ma.fstt.lsi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.fstt.lsi.entities.Project;
import ma.fstt.lsi.repositories.ProjectRepository;



@Service
public class ProjectService implements BaseRestService<Project, Long> {

	@Autowired
	private ProjectRepository repository ;
	
	
	@Override
	public List<Project> getAll() {
		List<Project> Projects = new ArrayList<>();
		repository.findAll().forEach(Projects::add);
		return Projects;
	}

	@Override
	public Project get(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public Project create(Project resource) {
		return repository.save(resource);
		
	}

	@Override
	public Project update(Long id, Project resource) {
		resource.setId_project(id);
		return repository.save(resource);	
		
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}

	
	

}
