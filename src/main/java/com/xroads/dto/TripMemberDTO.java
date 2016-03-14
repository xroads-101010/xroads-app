package com.xroads.dto;

public class TripMemberDTO {
	
	private int memberId;
	
	private String memberName;
	
	private int tripId;
	
	private String memberStartingLocation;
	
	private double memberStartingLocationLat;

	private double memberStartingLocationLong;
	
	private Boolean hasMemberJoined;	
	
	private String currentLocation;
	
	private double currentLocationLat;
	
	private double currentLocationLong;


	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getTripId() {
		return tripId;
	}

	public void setTripId(int tripId) {
		this.tripId = tripId;
	}

	public String getMemberStartingLocation() {
		return memberStartingLocation;
	}

	public void setMemberStartingLocation(String memberStartingLocation) {
		this.memberStartingLocation = memberStartingLocation;
	}

	public Boolean getHasMemberJoined() {
		return hasMemberJoined;
	}

	public void setHasMemberJoined(Boolean hasMemberJoined) {
		this.hasMemberJoined = hasMemberJoined;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public double getMemberStartingLocationLat() {
		return memberStartingLocationLat;
	}

	public void setMemberStartingLocationLat(double memberStartingLocationLat) {
		this.memberStartingLocationLat = memberStartingLocationLat;
	}

	public double getMemberStartingLocationLong() {
		return memberStartingLocationLong;
	}

	public void setMemberStartingLocationLong(double memberStartingLocationLong) {
		this.memberStartingLocationLong = memberStartingLocationLong;
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
