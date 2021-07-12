package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Cars;

@Repository
public class CarRepository {

	@Autowired
	private JdbcTemplate template;

	public int addCar(Cars entity) {

		SimpleJdbcInsert inserter = new SimpleJdbcInsert(template);

		inserter.withTableName("Cars").usingColumns("yearofManufacture", "distanceTraveled", "modelName", "colour", "status");

		BeanPropertySqlParameterSource sql = new BeanPropertySqlParameterSource(entity);

		return inserter.execute(sql);
	}

	public List<Cars> getAllCars(){

		String sql = "select * from Cars";

		List<Cars> carList = template.query(sql, BeanPropertyRowMapper.newInstance(Cars.class));

		return carList;
	}


	public List<Cars> searchByCarModel(String modelName){

		String sql = "select * from Cars where modelName like '%" + modelName + "%'" ;

		List<Cars> carList = template.query(sql, BeanPropertyRowMapper.newInstance(Cars.class));

		return carList;
	}

}
