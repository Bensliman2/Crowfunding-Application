package ma.fstt.lsi.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Admin implements Serializable, UserDetails{

	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String email;
	private String passwd;
	private String tel;
	public Admin() {
	}
	public Admin(String nom, String email, String passwd, String tel) {
		super();
		this.nom = nom;
		this.email = email;
		this.passwd = passwd;
		this.tel = tel;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> list = new ArrayList<>();
		return list;
	}
	@JsonIgnore
	public String getPassword() {
		return passwd;
	}
	@JsonIgnore
	public String getUsername() {
		return email;
	}
	@JsonIgnore
	public boolean isAccountNonExpired() {
		return true;
	}
	@JsonIgnore
	public boolean isAccountNonLocked() {
		return true;
	}
	@JsonIgnore
	public boolean isCredentialsNonExpired() {
		return true;
	}
	@JsonIgnore
	public boolean isEnabled() {
		return true;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
