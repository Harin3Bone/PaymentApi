package com.developer.scb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.developer.scb.entity.QrEntity;
import com.developer.scb.model.ResponseModel;
import com.developer.scb.service.SCBService;

@RestController
public class SCBController {

	@Autowired
	private SCBService scbService;
	
	@PostMapping(value = "/qr")
	@ResponseStatus(code = HttpStatus.OK)
	public ResponseEntity<ResponseModel> reqScbQr(@RequestBody() QrEntity body){
		String token = scbService.reqScbToken(body.getTransactionId());
		return ResponseEntity.ok(new ResponseModel(HttpStatus.OK, "Success", token));
	}	
}
