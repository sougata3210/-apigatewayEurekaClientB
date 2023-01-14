package com.service2.service2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service2.service2.pojo.Address;

@RestController
public class AddressController {
	@GetMapping("/address")
	public List<Address> getAllAddress() {
		System.out.println("inside get address");
		List<Address> empAddressList  =new ArrayList<Address>();
		Address add1 = new Address();
		add1.setDistrict("N24 pgs");
		add1.setPin("743127");
		empAddressList.add(add1);
		
		return empAddressList;
	}
	
	
	@GetMapping("/test")
	public List<String> getAllTestAddress() {
		
		List<String> empAddressList  =new ArrayList<String>();
		empAddressList.add("My life is briliant");
		empAddressList.add("My love is pure!");
		
		return empAddressList;
	}

}
