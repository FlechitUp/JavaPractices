package com.mkyong.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserImp implements IUSer{

	@Override
	public void register(String name) {		
		System.out.print("Se registro " + name);
	}

}
