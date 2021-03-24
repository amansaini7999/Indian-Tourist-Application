package com.toursit.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.toursit.backend.entities.Place;
import com.toursit.backend.services.Services;

@RestController
public class MyController {
	
	@Autowired
	private Services varService;
	
	@GetMapping("/")
	public List<Place> getPlaces() {
		return this.varService.getPlaces();
	}
	
	@GetMapping("/{state}")
	public List<Place> getSateFilteredPlaces(@PathVariable String state){
		return this.varService.getStateFilteredPlaces(state);
	}
	
	@GetMapping("/{state}/{district}")
	public List<Place> getDistrictFilteredPlaces(@PathVariable String state, @PathVariable String district){
		return this.varService.getDistrictFilteredPlaces(state, district);
	}
	
	@PostMapping("/")
	public Place addPlace(@RequestBody Place place) {
		return this.varService.addPlace(place);
	}
	
}
