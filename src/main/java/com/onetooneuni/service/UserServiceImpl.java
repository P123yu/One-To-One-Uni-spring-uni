package com.onetooneuni.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onetooneuni.model.UserModel;
import com.onetooneuni.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserModel insert(UserModel userModel) {
		return userRepository.save(userModel);
	}
	
	
	@Override
	public UserModel getByRollNo(Long rollNo) {
		return userRepository.findByRollNo(rollNo);
	}
	
	@Override
	public void deleteUsingId(Long id) {
		userRepository.deleteById(id);	
	}

}
