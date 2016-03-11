package com.xroads.dto;

public class TripMemberDTO {
	
	private int memberId;
	
	private String memberName;
	
	private int tripId;
	
	private String memberStartingLocation;
	
	private Boolean hasMemberJoined;	
	
	private String currentLocation;
	
	private String currentLocationName;

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

	public String getCurrentLocationName() {
		return currentLocationName;
	}

	public void setCurrentLocationName(String currentLocationName) {
		this.currentLocationName = currentLocationName;
	}
	
	
	
}
