package ma.fstt.lsi.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Donation")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type",discriminatorType = DiscriminatorType.STRING, length = 4)
public class Donation implements Serializable  {
	

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, unique=true)
	private long id_donation;
	


	@Column(nullable = true)
	private Date date_donation;
	
	
	@ManyToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "id_user")
	private User user;
	
	@ManyToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "id_project")
	private Project project;
	

	public Donation() {
		super();
	}

	public Donation(long id_donation, Date date_donation) {
		super();
		this.id_donation = id_donation;
		this.date_donation = date_donation;
	}
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public long getId_donation() {
		return id_donation;
	}

	public void setId_donation(long id_donation) {
		this.id_donation = id_donation;
	}

	public Date getDate_donation() {
		return date_donation;
	}

	public void setDate_donation(Date date_donation) {
		this.date_donation = date_donation;
	}
	
	
	
	
}
