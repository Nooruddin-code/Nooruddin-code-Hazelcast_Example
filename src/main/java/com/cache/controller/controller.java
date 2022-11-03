package com.cache.controller;

import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cache.services.ServiceProvider;

@RestController
@RequestMapping("/")
public class controller {
	@Autowired
	private ServiceProvider serviceProvider;
	
	@Cacheable(cacheNames = "Device",key = "#Device_Type")
	@GetMapping("/set")
	public Map<String, Long> getall(@PathParam("Device_Type") String Device_Type ){
		System.out.println("this is method working");
		return serviceProvider.GetAllDevicesCatagory(Device_Type);
	}

	@Cacheable(cacheNames = "Device")
	@GetMapping("/get/{Device_Name}")
	public Map<String, Double> Device_Name(@PathVariable("Device_Name") String Device_Name ){
		System.out.println("this is method working");
		return serviceProvider.GetPriceOfDevice(Device_Name);
	}
}
