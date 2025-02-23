package com.spring.inventoryfinal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.spring.inventoryfinal.service.FileUploadService;

@SpringBootApplication
public class InventoryfinalApplication extends SpringBootServletInitializer implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(InventoryfinalApplication.class, args);
	}
	
	@Autowired
	private FileUploadService fileUploadService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		fileUploadService.init();
		
	}

}
