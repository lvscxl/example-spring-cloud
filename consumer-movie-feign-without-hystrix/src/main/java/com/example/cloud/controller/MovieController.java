package com.example.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.cloud.entity.User;
import com.example.cloud.service.IUserCustomFeignClient;
import com.example.cloud.service.IUserFeignClient;

@RestController
public class MovieController {

	@Autowired
	private IUserFeignClient userFeignClient;

	@Autowired
	private IUserCustomFeignClient userCustomFeignClient;

	@GetMapping("/movie/{id}")
	public User findById(@PathVariable Long id) throws Exception {
		return this.userFeignClient.findById(id);
	}

	@GetMapping("/{serviceName}")
	public String findEurekaByServiceName(@PathVariable String serviceName) throws Exception {
		return this.userCustomFeignClient.findEurekaByServiceName(serviceName);
	}

}
