package com.nafys.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nafys.springsecurity.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
