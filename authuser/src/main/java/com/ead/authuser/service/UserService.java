package com.ead.authuser.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import com.ead.authuser.models.UserModel;

public interface UserService {
	
	List<UserModel> findAll();
	Page<UserModel> findAll(Specification<UserModel> spec, Pageable pageable);
	Optional<UserModel> findById(UUID id);
	void delete(UserModel userModel);
	void save(UserModel userModel);
	boolean existsByUsername(String username);
	boolean existsByEmail(String email);
	
}
