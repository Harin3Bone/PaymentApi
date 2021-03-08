package com.developer.scb.model;

import java.sql.Timestamp;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.Data;

@ResponseBody
@Data
public class ResponseModel {

	private String timestamp;
	private int status;
	private String message;
	private Object data;

	public ResponseModel(HttpStatus status, String message) {
		super();
		this.timestamp = new Timestamp(System.currentTimeMillis()).toString();
		this.status = status.value();
		this.message = message;
	}

	public ResponseModel(HttpStatus status, String message, Object data) {
		super();
		this.timestamp = new Timestamp(System.currentTimeMillis()).toString();
		this.status = status.value();
		this.message = message;
		this.data = data;
	}

}
