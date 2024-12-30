package com.example.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.login.service.UserRolePermissionService;

@SpringBootApplication
public class LoginApplication implements CommandLineRunner{

    @Autowired
    private UserRolePermissionService service;

    public static void main(String[] args) {
        SpringApplication.run(LoginApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        // Call the service method here
    String s=service.createAdminUser();
    System.out.println(s);
   
	/*
	 * @Override public void run(String... args) throws Exception { // Invoke the
	 * createAdminUser method here boolean created = service.createAdminUser("sahi",
	 * "sahi@1234", "financial"); if (created) {
	 * System.out.println("Admin user created successfully!"); } else {
	 * System.out.println("Admin user already exists."); } System.out.println(); }
	 */
}}
