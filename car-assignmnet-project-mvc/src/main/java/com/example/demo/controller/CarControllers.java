package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Cars;
import com.example.demo.repository.CarRepository;

@Controller
public class CarControllers {

	@Autowired
	private Cars car;

	@Autowired
	private CarRepository repo;

	@RequestMapping(value = "/cars", method = RequestMethod.GET)
	public String initForm(Model model) { 
		model.addAttribute("command", car);
		return "addcars"; 
	}

	@RequestMapping(value = "/cars", method = RequestMethod.POST)
	public String submitForm(Model model, @ModelAttribute("command") Cars car) {
		if(car.getcolour().isEmpty() || car.getModelName().isEmpty()) {
			model.addAttribute("error", "Car Details can not be empty");
			model.addAttribute("command", car);
			return "addcars";
		}
		System.out.println(car);
		int rowAdded = repo.addCar(car);
		List<Cars> list = repo.getAllCars();

		model.addAttribute("list", list);

		return "showcars";
	}

	@RequestMapping(value = "/cars/all", method = RequestMethod.GET)
	public String findAllCars(Model model) {

		List<Cars> list = repo.getAllCars();

		model.addAttribute("list", list);

		return "showcars";
	}


	@RequestMapping(value = "/cars/search", method = RequestMethod.GET)
	public String searchInCarsDisplay(Model model) {
		model.addAttribute("command", car);
		return "searchcars";
	}

	@RequestMapping(value = "/cars/search", method = RequestMethod.POST)
	public String searchInCars(Model model, @RequestParam String modelName) {
		List<Cars> list = repo.searchByCarModel(modelName);
		model.addAttribute("list", list);
		return "showcars";
	}



}
