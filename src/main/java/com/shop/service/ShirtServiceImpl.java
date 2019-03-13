package com.shop.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.shop.entity.Shirt;
import com.shop.entity.Shirt.Color;
import com.shop.entity.Shirt.Size;

@Service
public class ShirtServiceImpl implements ShirtService {

	@Override
	public List<Shirt> getAllShirts() {
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
