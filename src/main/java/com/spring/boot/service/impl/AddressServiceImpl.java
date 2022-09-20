package com.spring.boot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.model.Address;
import com.spring.boot.repository.AddressRepository;
import com.spring.boot.repository.UserRepository;
import com.spring.boot.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {
	
	private AddressRepository addressRepository;
	private UserRepository userRepository;
	
	@Autowired
	public AddressServiceImpl(AddressRepository addressRepository,UserRepository userRepository) {
		this.addressRepository = addressRepository;
		this.userRepository=userRepository;
	}

	@Override
	public List<Address> adressList() {
		// TODO Auto-generated method stub
		return addressRepository.findAll();
	}

	@Override
	public Address findOne(Long id) {
		// TODO Auto-generated method stub
		return addressRepository.findById(id).get();
	}

	@Override
	public Address addAddress(Address address) {
		address.setUser(userRepository.findById(address.getUserId()).get());
		return addressRepository.save(address);
	}

	@Override
	public String deleteAddress(Long id) {
		// TODO Auto-generated method stub
		addressRepository.deleteById(id);
		return "{'message' : 'address deleted successfully'}";
	}
	
}
