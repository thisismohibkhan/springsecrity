package com.nafys.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nafys.springsecurity.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

}
