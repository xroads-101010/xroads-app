package com.xroads.dao.entities;

import java.io.Serializable;

import org.joda.time.DateTime;

public class TripMemberLocation implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private int tripMemberId;
	private String currentLocation;
	private DateTime createdAt;
	private DateTime updatedAt;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTripMemberId() {
		return tripMemberId;
	}
	public void setTripMemberId(int tripMemberId) {
		this.tripMemberId = tripMemberId;
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

}
