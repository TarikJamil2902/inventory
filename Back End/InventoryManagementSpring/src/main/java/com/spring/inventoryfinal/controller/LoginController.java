package com.spring.inventoryfinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.inventoryfinal.dto.Login;
import com.spring.inventoryfinal.entity.Distributor;
import com.spring.inventoryfinal.entity.LoginRegistration;
import com.spring.inventoryfinal.repository.DistributorRepository;
import com.spring.inventoryfinal.repository.LoginRegRepository;

@RestController
@RequestMapping("/login")
@CrossOrigin(origins="http://localhost:4200", allowedHeaders = "*")
public class LoginController {

	@Autowired
	LoginRegRepository loginRegRepo;
	
	@Autowired
	DistributorRepository disRepo;
	
	
	@PostMapping("/login")
	public LoginRegistration login (@RequestBody Login login ) {
		
		return loginRegRepo.login(login.getName(), login.getPassword2());
		
	}
	
	
	@PostMapping("/loginDis")
	public Distributor logindistributor (@RequestBody Login login ) {
		
		return disRepo.login(login.getName(), login.getPassword2());
		
	}
	
	
	
	
	
}
