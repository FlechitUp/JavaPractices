package com.mkyong.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkyong.repository.IUSer;

@Service
public class UserServiceImp implements IUserService {
	
	@Autowired
	private IUSer userRepo;
	
	@Override
	public void register(String name) {	
		userRepo.register(name);
	}

}
