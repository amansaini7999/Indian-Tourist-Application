package com.toursit.backend.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.toursit.backend.entities.Place;

public interface PlaceDao extends JpaRepository<Place, String>{
	
	public List<Place> findByState(String state);
	
	public List<Place> findByStateAndDistrict(String state, String district); 
	
}
