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
@Table(name="Reward")
public class Reward implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getReward_cond() {
		return reward_cond;
	}

	public void setReward_cond(String reward_cond) {
		this.reward_cond = reward_cond;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, unique=true)
	private long id_reward;
	
	@Column(nullable = true)
	private String the_reward;
	
	@Column(nullable = true)
	private String reward_cond;
	
	@ManyToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "id_project")
	private Project project;
	

	public Reward() {
		super();
	}

	public Reward(long id_reward, String the_reward, String condition) {
		super();
		this.id_reward = id_reward;
		this.the_reward = the_reward;
		this.reward_cond = condition;
	}

	public long getId_reward() {
		return id_reward;
	}

	public void setId_reward(long id_reward) {
		this.id_reward = id_reward;
	}

	public String getThe_reward() {
		return the_reward;
	}

	public void setThe_reward(String the_reward) {
		this.the_reward = the_reward;
	}

	public String getCondition() {
		return reward_cond;
	}

	public void setCondition(String condition) {
		this.reward_cond = condition;
	}
	
	

}
