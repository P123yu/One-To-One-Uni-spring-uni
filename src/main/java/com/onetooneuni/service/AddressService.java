package com.onetooneuni.service;


import org.springframework.stereotype.Service;
import com.onetooneuni.model.AddressModel;


@Service
public interface AddressService {
	AddressModel insert(AddressModel addressModel);
	AddressModel getByCity(String userCity);
}
