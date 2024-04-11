package com.onetooneuni.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onetooneuni.model.AddressModel;

public interface AddressRepository extends JpaRepository<AddressModel,Long>{
	
	AddressModel findByUserCity(String userCity);

}
