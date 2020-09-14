package ma.fstt.lsi.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Link")
public class Link implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, unique=true)
	private long id_link;
	
	@Column(nullable = true, length = 255)
	private String the_link;
	
	@Column(nullable = true, length = 255)
	private String description;
	
	@ManyToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "id_project")
	private Project project;
	
	

	public Link() {
		super();
	}

	public Link(long id_link, String the_link, String description) {
		super();
		this.id_link = id_link;
		this.the_link = the_link;
		this.description = description;
	}

	public long getId_link() {
		return id_link;
	}

	public void setId_link(long id_link) {
		this.id_link = id_link;
	}

	public String getThe_link() {
		return the_link;
	}

	public void setThe_link(String the_link) {
		this.the_link = the_link;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
