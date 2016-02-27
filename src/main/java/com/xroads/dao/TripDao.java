package com.xroads.dao;

import org.apache.ibatis.annotations.Param;

import com.xroads.dao.entities.Trip;

public interface TripDao {

	Trip readTripById(@Param("id") Integer id);
	
	public long createTrip(Trip trip);
	
	public long updateTripById(Integer id, Trip trip);
}
