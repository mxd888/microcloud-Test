package com.hdu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hdu.springCloud.entities.Dept;
import com.hdu.springcloud.service.DeptService;


@RestController
public class DeptController {

	@Autowired
	private DeptService service;
	
	
	@PostMapping(value="/dept/add")
	public boolean add(@RequestBody Dept dept) {
		return service.add(dept);
	}
	
	@GetMapping(value="/dept/get/{id}")
	public Dept get(@PathVariable("id") Integer id) {
		return service.get(id);
	}
	
	@GetMapping(value="/dept/list")
	public List<Dept> list() {
		return service.list();
	}
	

	
	
}
