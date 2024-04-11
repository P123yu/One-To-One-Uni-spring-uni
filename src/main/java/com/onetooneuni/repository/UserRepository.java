package com.onetooneuni.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onetooneuni.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel,Long>{
	
	UserModel findByRollNo(Long rollNo);

}
