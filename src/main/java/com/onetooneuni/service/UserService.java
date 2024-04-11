package com.onetooneuni.service;


import org.springframework.stereotype.Service;

import com.onetooneuni.model.UserModel;

@Service
public interface UserService {
	UserModel insert(UserModel userModel);
	UserModel getByRollNo(Long rollNo);
	void deleteUsingId(Long id);

}
