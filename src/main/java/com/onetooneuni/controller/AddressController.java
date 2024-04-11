package com.onetooneuni.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onetooneuni.model.AddressModel;

import com.onetooneuni.service.AddressServiceImpl;


@RestController
@CrossOrigin
public class AddressController {
	

	@Autowired
	private AddressServiceImpl addressServiceImpl;
	

	@PostMapping("/postAddress")
	public ResponseEntity<?>insert(@RequestBody AddressModel addressModel){
		AddressModel address=addressServiceImpl.insert(addressModel);
		if(address!=null) {
			return ResponseEntity.ok(address);
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("not inserted");  
		}
	}
	
	
	
	@GetMapping("/getAddress/{userCity}")
	public ResponseEntity<?>getByCity(@PathVariable String userCity){
		AddressModel address=addressServiceImpl.getByCity(userCity);
		if(address!=null) {
			return ResponseEntity.ok(address);
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("not fetched based on that city");  
		}
	}
	
	
}
