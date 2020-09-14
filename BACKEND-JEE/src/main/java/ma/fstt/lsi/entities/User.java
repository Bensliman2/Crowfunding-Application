package ma.fstt.lsi.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(nullable = false, unique=true)
	private String email;
	
	@Column(nullable = true, length = 255)
	private String password;
	
	@Column(nullable = true, length = 255)
	private String nom;  
	
	@Column(nullable = true, length = 255)
	private String prenom;
	
	@Column(nullable = true, length = 255)
	private String adress;
	
	@Column(nullable = true)
	private Long age;
	
//	@Column(nullable = true, length = 255)
//	private String image;
	
	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private List<Donation> donations;
	
	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private List<Project> projects;
	
	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public List<Donation> getDonations() {
		return donations;
	}

	public void setDonations(List<Donation> donations) {
		this.donations = donations;
	}

	public User() {
		super();
	}

	public User(String email, String password, String nom, String prenom, String adress, Long age) {
		super();
		this.email = email;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.adress = adress;
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}




}
