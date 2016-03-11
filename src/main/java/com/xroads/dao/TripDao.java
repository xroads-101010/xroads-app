package com.xroads.dao;

import java.util.List;

import com.xroads.dao.entities.Trip;

public interface TripDao {

	Trip readTripById(Integer tripId);
	
	public long createTrip(Trip trip);
	
	public long updateTripById(Trip trip);
	
	List <Trip> readTripByChampion(Integer tripChampion);
}
