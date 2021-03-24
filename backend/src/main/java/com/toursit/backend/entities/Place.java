package com.toursit.backend.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Place {
	
	@Id
	private String name;
	private String state;
	private String district;
	private String url;
	
	public Place(String name, String state, String district, String url) {
		super();
		this.name = name;
		this.state = state;
		this.district = district;
		this.url = url;
	}

	public Place() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Place [name=" + name + ", state=" + state + ", district=" + district + ", url=" + url + "]";
	}
	
}
