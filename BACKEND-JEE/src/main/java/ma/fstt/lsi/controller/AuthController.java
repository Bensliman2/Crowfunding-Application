package ma.fstt.lsi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ma.fstt.lsi.entities.Admin;
import ma.fstt.lsi.models.AuthentificationRequest;
import ma.fstt.lsi.models.AuthentificationResponse;
import ma.fstt.lsi.services.AdminService;
import ma.fstt.lsi.util.JwtUtil;

@RestController
@CrossOrigin("*")
public class AuthController {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private AdminService userDetailsService;
	@Autowired
	private JwtUtil jwtUtil;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<AuthentificationResponse> authenticate(@RequestBody AuthentificationRequest authentificationRequest) throws Exception{
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authentificationRequest.getEmail(), authentificationRequest.getPasswd()));
			
		}catch(BadCredentialsException e) {
			throw new Exception("login ou mdp incorrect !!");
		}
		final UserDetails userDetails = userDetailsService.loadUserByUsername(authentificationRequest.getEmail());
		final String token = jwtUtil.generateToken(userDetails);
		return ResponseEntity.ok(new AuthentificationResponse(token));
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public Admin register(@RequestBody Admin resource) {
		resource.setPasswd(passwordEncoder.encode(resource.getPasswd()));
		return userDetailsService.create(resource);
	}
	
	

}
