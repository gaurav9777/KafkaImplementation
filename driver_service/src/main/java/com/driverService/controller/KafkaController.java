package com.driverService.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.driverService.service.KafkaService;

@RestController
@RequestMapping("/v1/driver")
public class KafkaController {

	@Autowired
	private KafkaService kafkaService;
	
	@PostMapping("/location")
	public ResponseEntity<?> updateLocation(){
		
		
		for(int i=0;i<500000;i++) {
			String loc="( "+Math.round(Math.random()*100)+"  ,  "+Math.round(Math.random()*100)+" )";
			kafkaService.updateLocation(loc);
		}
		return new ResponseEntity<>(Map.of("message","Location updated from driver"),HttpStatus.OK);
	}
}
