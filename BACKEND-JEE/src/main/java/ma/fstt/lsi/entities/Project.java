package ma.fstt.lsi.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Project")
public class Project implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, unique=true)
	private long id_project;
	
	@Column(nullable = true, length = 255)
	private String name_project;
	
//	@Column(nullable = true, length = 255)
//	private String image_project;
	
	@Column(nullable = true)
	private Long budget ;
	
	@Column(nullable = true)
	private String description ;
	
	@Column(nullable = true)
	private int likes ;
	
	@Column(nullable = true)
	private int views ;
	
	@Column(nullable = true)
	private Date date_creation ;
	
	
	@OneToMany(mappedBy = "project", fetch = FetchType.LAZY)
	private List<Donation> donations;
	
	@OneToMany(mappedBy = "project", fetch = FetchType.LAZY)
	private List<Link> links;
	
	@OneToMany(mappedBy = "project", fetch = FetchType.LAZY)
	private List<Reward> rewards;
	
	@ManyToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "id_user")
	private User user;
	
	@ManyToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "id_gamecat")
	private GameCat gamecat;
	
	
	
	
	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Donation> getDonations() {
		return donations;
	}

	public void setDonations(List<Donation> donations) {
		this.donations = donations;
	}

	public Project() {
		super();
	}

	public Project(long id_project, String name_project, Long budget, String description, int likes, int views,
			Date date_creation) {
		super();
		this.id_project = id_project;
		this.name_project = name_project;
		this.budget = budget;
		this.description = description;
		this.likes = likes;
		this.views = views;
		this.date_creation = date_creation;
	}

	public long getId_project() {
		return id_project;
	}

	public void setId_project(long id_project) {
		this.id_project = id_project;
	}

	public String getName_project() {
		return name_project;
	}

	public void setName_project(String name_project) {
		this.name_project = name_project;
	}

	public Long getBudget() {
		return budget;
	}

	public void setBudget(Long budget) {
		this.budget = budget;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public Date getDate_creation() {
		return date_creation;
	}

	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	
	


}
