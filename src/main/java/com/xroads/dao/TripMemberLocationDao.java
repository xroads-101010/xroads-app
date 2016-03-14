package com.xroads.dao;

import java.util.List;

import com.xroads.dao.entities.TripMemberLocation;

public interface TripMemberLocationDao {
	
	void addOrUpdateMemberLocation(List<TripMemberLocation> tripMemberLocationDTOList);
	
}
