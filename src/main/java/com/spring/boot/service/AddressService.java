package com.spring.boot.service;

import java.util.List;

import com.spring.boot.model.Address;

public interface AddressService {
	
	List<Address> adressList();
	Address findOne(Long id);
	Address addAddress(Address address);
	String deleteAddress(Long id);
}
