package com.toursit.backend.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toursit.backend.dao.PlaceDao;
import com.toursit.backend.entities.Place;

@Service
public class ServiceImplemntation implements Services {
	
	@Autowired
	private PlaceDao placeDao;
	
	public ServiceImplemntation() {
		
	}

	@Override
	public List<Place> getPlaces() {		
		return placeDao.findAll();
	}

	@Override
	public Place addPlace(Place place) {
		placeDao.save(place);
		return place;
	}

	@Override
	public List<Place> getStateFilteredPlaces(String state) {
		return placeDao.findByState(state);
	}

	@Override
	public List<Place> getDistrictFilteredPlaces(String state, String district) {
		return placeDao.findByStateAndDistrict(state, district);
	}

}
