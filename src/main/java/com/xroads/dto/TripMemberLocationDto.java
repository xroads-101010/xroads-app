package com.xroads.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TripMemberLocationDto {
	
	@JsonProperty(value="tripMemberId")
	private int tripMemberId;
	@JsonProperty(value="location")
	private String location;
	@JsonProperty(value="createdAt")
	private String createdAt;
	@JsonProperty(value="updatedAt")
	private String updatedAt;
	
	public int getTripMemberId() {
		return tripMemberId;
	}
	public void setTripMemberId(int tripMemberId) {
		this.tripMemberId = tripMemberId;
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

}
