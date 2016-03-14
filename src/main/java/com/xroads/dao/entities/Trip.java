package com.xroads.dao.entities;

import java.io.Serializable;

import org.joda.time.DateTime;

public class Trip implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String tripName;
	private String tripDestination;
	private double tripDestinationLat;
	private double tripDestinationLong;
	private int tripChampion;
	private Boolean hasTripStarted;
	private DateTime startTime;
	private DateTime endTime;
	private DateTime createdAt;
	private DateTime updatedAt;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getTripChampion() {
		return tripChampion;
	}
	public void setTripChampion(int tripChampion) {
		this.tripChampion = tripChampion;
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
