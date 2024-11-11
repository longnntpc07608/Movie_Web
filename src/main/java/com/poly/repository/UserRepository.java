package com.poly.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poly.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByUserName(String userName);
}
