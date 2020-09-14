package ma.fstt.lsi.models;

import java.io.Serializable;

public class AuthentificationResponse implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private final String token;
	public AuthentificationResponse(String token) {
		super();
		this.token = token;
	}
	public String getToken() {
		return token;
	}
	

}
