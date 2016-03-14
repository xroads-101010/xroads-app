package com.xroads.dto;

import java.util.List;

import org.joda.time.DateTime;

public class TripDTO {
	
	private int tripId;
	
	private String tripName;
	
	private String tripDestination;
	
	private double tripDestinationLat;

	private double tripDestinationLong;
	
	private String startLocationForCurrentUser;
	
	private double startLocationForCurrentUserLat;

	private double startLocationForCurrentUserLong;
	
	private int championUserId;
	
	private Boolean hasTripStarted;
	
	private DateTime startTime;

	private DateTime endTime;
	
	private List<TripMemberDTO> tripMembers;

	public int getTripId() {
		return tripId;
	}

	public void setTripId(int tripId) {
		this.tripId = tripId;
	}

	public String getTripName() {
		return tripName;
	}

	public void setTripName(String tripName) {
		this.tripName = tripName;
	}

	public String getTripDestination() {
		return tripDestination;
	}

	public void setTripDestination(String tripDestination) {
		this.tripDestination = tripDestination;
	}

	public String getStartLocationForCurrentUser() {
		return startLocationForCurrentUser;
	}

	public void setStartLocationForCurrentUser(String startLocationForCurrentUser) {
		this.startLocationForCurrentUser = startLocationForCurrentUser;
	}

	public int getChampionUserId() {
		return championUserId;
	}

	public void setChampionUserId(int championUserId) {
		this.championUserId = championUserId;
	}

	public Boolean getHasTripStarted() {
		return hasTripStarted;
	}

	public void setHasTripStarted(Boolean hasTripStarted) {
		this.hasTripStarted = hasTripStarted;
	}

	public DateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(DateTime startTime) {
		this.startTime = startTime;
	}

	public DateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(DateTime endTime) {
		this.endTime = endTime;
	}

	public List<TripMemberDTO> getTripMembers() {
		return tripMembers;
	}

	public void setTripMembers(List<TripMemberDTO> tripMembers) {
		this.tripMembers = tripMembers;
	}
	public double getTripDestinationLat() {
		return tripDestinationLat;
	}

	public void setTripDestinationLat(double tripDestinationLat) {
		this.tripDestinationLat = tripDestinationLat;
	}

	public double getTripDestinationLong() {
		return tripDestinationLong;
	}

	public void setTripDestinationLong(double tripDestinationLong) {
		this.tripDestinationLong = tripDestinationLong;
	}

	public double getStartLocationForCurrentUserLat() {
		return startLocationForCurrentUserLat;
	}

	public void setStartLocationForCurrentUserLat(
			double startLocationForCurrentUserLat) {
		this.startLocationForCurrentUserLat = startLocationForCurrentUserLat;
	}

	public double getStartLocationForCurrentUserLong() {
		return startLocationForCurrentUserLong;
	}

	public void setStartLocationForCurrentUserLong(
			double startLocationForCurrentUserLong) {
		this.startLocationForCurrentUserLong = startLocationForCurrentUserLong;
	}
	
	
}
