package com.example.login.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user_role_permission")
public class UserRolePermission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String role;

    @Column(nullable = false)
    private String encryptedPassword;

	
	  @Column(nullable = false)
	  private String createdBy;
	 
    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

	
	  public String getCreatedBy() {
		  return createdBy;
		  }
	  
	  public void setCreatedBy(String createdBy) { 
		  this.createdBy = createdBy;
	  }
	 
}

