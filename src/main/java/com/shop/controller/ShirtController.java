package com.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.entity.Shirt;
import com.shop.service.ShirtService;

@RequestMapping("/shirts")
@RestController
public class ShirtController {
	@Autowired
	private ShirtService shirtService;
	
	@GetMapping
	public List<Shirt> getShirts(){
		return shirtService.getAllShirts();
	}
	@PostMapping
	public String addShirt() {
		return null;
	}
}
