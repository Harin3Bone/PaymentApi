package com.developer.scb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.developer.scb.entity.SCBEntity;

@Service
public class SCBService {

	@Autowired
	private SCBEntity scbEntity;
	
	public String reqScbToken(String requestUId) {
		String token = "Token";
		return token;
	}
	
}
