package com.xroads.dao.entities;

import java.io.Serializable;

import org.joda.time.DateTime;

public class TripMemberLocation implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int userId;
	private String currentLocation;
	private double currentLocationLat;
	private double currentLocationLong;
	private DateTime createdAt;
	private DateTime updatedAt;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getCurrentLocation() {
		return currentLocation;
	}
	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}
	public DateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(DateTime createdAt) {
		this.createdAt = createdAt;
	}
	public DateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(DateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	public double getCurrentLocationLat() {
		return currentLocationLat;
	}
	public void setCurrentLocationLat(double currentLocationLat) {
		this.currentLocationLat = currentLocationLat;
	}
	public double getCurrentLocationLong() {
		return currentLocationLong;
	}
	public void setCurrentLocationLong(double currentLocationLong) {
		this.currentLocationLong = currentLocationLong;
	}
    
	

}
