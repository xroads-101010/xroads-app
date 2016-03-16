	package com.xroads.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TripMemberLocationDto {
	
	@JsonProperty(value="userId")
	private int userId;
	@JsonProperty(value="location")
	private String location;
	@JsonProperty(value="locationLat")
	private double locationLat;
	@JsonProperty(value="locationLong")
	private double locationLong;
	@JsonProperty(value="createdAt")
	private String createdAt;
	@JsonProperty(value="updatedAt")
	private String updatedAt;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int memberId) {
		this.userId = memberId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}
	public double getLocationLat() {
		return locationLat;
	}
	public void setLocationLat(double locationLat) {
		this.locationLat = locationLat;
	}
	public double getLocationLong() {
		return locationLong;
	}
	public void setLocationLong(double locationLong) {
		this.locationLong = locationLong;
	}
	

}
