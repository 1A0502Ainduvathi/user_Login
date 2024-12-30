package com.example.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.login.entity.UserRolePermission;
import com.example.login.repository.UserRolePermissionRepository;

@Service
public class UserRolePermissionService {

    @Autowired
    private UserRolePermissionRepository repository;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public String createAdminUser() {
    	if (repository.count()==0) {
            UserRolePermission admin = new UserRolePermission();
            admin.setName("sys_name");
            admin.setRole("Admin");
            admin.setEncryptedPassword(passwordEncoder.encode("sys_password").substring(0, 15));
            admin.setCreatedBy("System");
            //System.out.println("default user created");
            repository.save(admin);
    	}
            return "created successfully";
    	}
		/*
		 * else { UserRolePermission admin = new UserRolePermission();
		 * admin.setName(name); admin.setRole(role); admin.setCreatedBy("User");
		 * admin.setEncryptedPassword(passwordEncoder.encode(password).substring(0,
		 * 15)); repository.save(admin);
		 * System.out.println(name+",  "+password+",  "+role); return true; }
		 */
    }



