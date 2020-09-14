package ma.fstt.lsi.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="GameCat")
public class GameCat implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, unique=true)
	private long id_cat;
	
	@Column(nullable = true, length = 255)
	private String game;
	
	@OneToMany(mappedBy = "gamecat", fetch = FetchType.LAZY)
	private List<Project> Projects;
	
	
	

	public GameCat() {
		super();
	}

	public GameCat(long id_cat, String game) {
		super();
		this.id_cat = id_cat;
		this.game = game;
	}

	public long getId_cat() {
		return id_cat;
	}

	public void setId_cat(long id_cat) {
		this.id_cat = id_cat;
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}
	
	

}
