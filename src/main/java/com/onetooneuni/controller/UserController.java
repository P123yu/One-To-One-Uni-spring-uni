package com.onetooneuni.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;

import com.onetooneuni.model.UserModel;
import com.onetooneuni.service.UserServiceImpl;

@CrossOrigin
@RestController
public class UserController {
	
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@PostMapping("/postUser")
	public ResponseEntity<?>insert(@RequestBody UserModel userModel){
		UserModel user=userServiceImpl.insert(userModel);
		if(user!=null) {
			return ResponseEntity.ok(user);
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("not inserted");  
		}
	}
	
	
	@GetMapping("/getUser/{rollNo}")
	public ResponseEntity<?> getByRollNo(@PathVariable Long rollNo){
		UserModel user=userServiceImpl.getByRollNo(rollNo);
		if(user!=null) {
			return ResponseEntity.ok(user);
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("not fetched based on rollNo");  
		}	
	}
	

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?>deleteUsingId(@PathVariable Long id){
		try {
			userServiceImpl.deleteUsingId(id);
			return ResponseEntity.ok("deleted");
		}
		catch(Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("not deleted");  
		}
		
		
	}


}
