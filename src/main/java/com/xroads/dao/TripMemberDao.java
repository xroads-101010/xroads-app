package com.xroads.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xroads.dao.entities.TripMember;

public interface TripMemberDao {
	
	public long addTripMembers(List<TripMember> tripMembers);
	
	public long updateTripMember(TripMember tripMember);
	
	public TripMember[] getTripMembersByTripId(@Param("tripId") int tripId);

}
