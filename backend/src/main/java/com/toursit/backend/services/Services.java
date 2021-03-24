package com.toursit.backend.services;

import java.util.List;

import com.toursit.backend.entities.Place;

public interface Services {
	
	public List<Place> getPlaces();

	public Place addPlace(Place place);

	public List<Place> getStateFilteredPlaces(String state);

	public List<Place> getDistrictFilteredPlaces(String state, String district);
	
}
