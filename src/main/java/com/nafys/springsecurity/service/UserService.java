package com.nafys.springsecurity.service;

import com.nafys.springsecurity.model.User;

public interface  UserService {
	void save(User user);

    User findByUsername(String username);
}
