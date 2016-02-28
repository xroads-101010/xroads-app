package com.xroads.dao.entities;

import java.io.Serializable;

public class TripMember implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private int tripId;
	private int memberId;
	private String memberStartingLocation;
	private Boolean hasMemberJoined;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTripId() {
		return tripId;
	}
	public void setTripId(int tripId) {
		this.tripId = tripId;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	}
