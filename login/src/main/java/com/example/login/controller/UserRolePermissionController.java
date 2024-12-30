package com.example.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.login.entity.UserRolePermission;
import com.example.login.repository.UserRolePermissionRepository;
import com.example.login.service.UserRolePermissionService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserRolePermissionController {

    @Autowired
    private UserRolePermissionRepository repository;

    @Autowired
    private UserRolePermissionService service;

    // GET all users
    @GetMapping
    public List<UserRolePermission> getAllUsers() {
        return repository.findAll();
    }

    // GET user by ID
    @GetMapping("/{id}")
    public ResponseEntity<UserRolePermission> getUserById(@PathVariable Long id) {
        Optional<UserRolePermission> user = repository.findById(id);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // DELETE user by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserById(@PathVariable Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
	/*
	 * // POST to create admin user
	 * 
	 * @PostMapping("/admin") public ResponseEntity<String> createAdmin(@RequestBody
	 * String name, @RequestBody String password, @RequestBody String role) {
	 * boolean created = service.createAdminUser(name, password, role); if (created)
	 * { return ResponseEntity.ok("Admin user created successfully."); } else {
	 * return ResponseEntity.badRequest().body("Admin user already exists.."); } }
	 */
}

