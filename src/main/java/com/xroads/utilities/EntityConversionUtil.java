package com.xroads.utilities;

import java.util.ArrayList;
import java.util.List;

import com.xroads.dao.entities.Trip;
import com.xroads.dao.entities.TripMember;
import com.xroads.dto.TripDTO;
import com.xroads.dto.TripMemberDTO;


public class EntityConversionUtil  {

	
	public static Trip createTripEntityFromDTO(TripDTO tripDTO){
		Trip trip = new Trip();	
		trip.setTripName(tripDTO.getTripName());
		trip.setTripDestination(tripDTO.getTripDestination());
		trip.setTripChampion(tripDTO.getChampionUserId());
		trip.setHasTripStarted(tripDTO.getHasTripStarted());
		trip.setEndTime(tripDTO.getEndTime());
		trip.setStartTime(tripDTO.getStartTime());
		return trip;
	}
	
	public static List<TripMember> createTripMemberEntitiesFromDTO(TripDTO tripDTO){
		List<TripMember> tripMemberList = new ArrayList<TripMember>();
		List<TripMemberDTO> tripMemberDTOList = tripDTO.getTripMembers();
		for(TripMemberDTO tripMemberDTO:tripMemberDTOList){
			TripMember tripMember = new TripMember();
			tripMember.setTripId(tripDTO.getTripId());
			tripMember.setMemberId(tripMemberDTO.getMemberId());
			tripMember.setMemberStartingLocation(tripDTO.getStartLocationForCurrentUser());
			tripMember.setHasMemberJoined(tripMemberDTO.getHasMemberJoined());
			tripMemberList.add(tripMember);
		}
		return tripMemberList;
	}
	
	public static TripMember createChampionTripMemberEntity(TripDTO tripDTO){
		
		TripMember tripMember = new TripMember();
		tripMember.setTripId(tripDTO.getTripId());
		tripMember.setMemberId(tripDTO.getChampionUserId());
		tripMember.setMemberStartingLocation(tripDTO.getStartLocationForCurrentUser());
		tripMember.setHasMemberJoined(true);
		return tripMember;
	}
	
	

}