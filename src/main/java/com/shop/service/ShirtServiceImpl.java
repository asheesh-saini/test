package com.shop.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.entity.Shirt;
import com.shop.entity.Shirt.Color;
import com.shop.entity.Shirt.Size;
import com.shop.repository.ShirtRepository;

@Service
public class ShirtServiceImpl implements ShirtService {
	@Autowired
	private ShirtRepository shirtRepository;

	@Override
	public List<Shirt> getAllShirts() {
		System.out.println(shirtRepository.getShirts());
		Shirt shirt = new Shirt();
		shirt.setColor(Color.BLACK);
		shirt.setId("s1");
		shirt.setName("Royal black Shirt");
		shirt.setQuantity(5);
		shirt.setSize(Size.M);
		List<Shirt> shirtList = new ArrayList<Shirt>();
		shirtList.add(shirt);
		return shirtList;
	}

}
