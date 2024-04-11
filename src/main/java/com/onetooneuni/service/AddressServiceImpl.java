package com.onetooneuni.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onetooneuni.model.AddressModel;
import com.onetooneuni.repository.AddressRepository;


@Service
public class AddressServiceImpl implements AddressService{
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Override
	public AddressModel insert(AddressModel addressModel) {
		return addressRepository.save(addressModel);
	}
	
	@Override
	public AddressModel getByCity(String userCity) {
		return addressRepository.findByUserCity(userCity);
	}
}
