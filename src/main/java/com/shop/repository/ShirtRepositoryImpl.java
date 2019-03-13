package com.shop.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.shop.entity.Shirt;

@Repository
public class ShirtRepositoryImpl implements ShirtRepository {
	
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	public ShirtRepositoryImpl() {
		System.out.println("jdbctemplate : " + jdbcTemplate);
	}

	@Override
	public List<Shirt> getShirts() {
		System.out.println("jdbcTemplate repo : " + jdbcTemplate);
		return null;
	}

}
