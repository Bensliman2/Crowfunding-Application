package ma.fstt.lsi.models;

import java.io.Serializable;

public class AuthentificationRequest implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String email;
	private String passwd;
	public AuthentificationRequest() {
	}
	public AuthentificationRequest(String email, String mdp) {
		super();
		this.email = email;
		this.passwd = mdp;
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
	public void setPasswd(String mdp) {
		this.passwd = mdp;
	}


}
