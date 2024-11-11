package com.poly.service;

import com.poly.models.User;

public interface UserService {
	User findByUserName(String userName);
}
