package com.sam.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}

@RestController
@RequestMapping(value = "/api")
class restController{
	
	@RequestMapping(value = "/v1", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public Map getMap(){
		HashMap map = new HashMap();
		try {
			map.put("name", "sam");
			map.put("doing", "Hello, World!");
		} catch (Exception e) {
			throw e;
		}
		return map;
	}
}