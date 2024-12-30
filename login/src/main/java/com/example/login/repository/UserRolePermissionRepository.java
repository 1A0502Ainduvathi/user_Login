package com.example.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.login.entity.UserRolePermission;
public interface UserRolePermissionRepository extends JpaRepository<UserRolePermission, Long> {
   
}

