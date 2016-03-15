package com.xroads.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.xroads.dao.TripDao;
import com.xroads.dao.TripMemberDao;
import com.xroads.dao.entities.Trip;
import com.xroads.dao.entities.TripMember;
import com.xroads.dto.TripDTO;
import com.xroads.dto.TripMemberDTO;
import com.xroads.utilities.EntityConversionUtil;
	
public class TripService {

	@Autowired
	TripDao tripDao;
	
	@Autowired
	TripMemberDao tripMemberDao;
	
	
	public void newTrip(TripDTO tripDTO ) {
		
		Trip trip = EntityConversionUtil.createTripEntityFromDTO(tripDTO);
		tripDao.createTrip(trip);
		tripDTO.setTripId(trip.getId());
		
		//Add Trip Members and the champion as a trip member
		List<TripMember> tripMembers = EntityConversionUtil.createTripMemberEntitiesFromDTO(tripDTO);
		tripMembers.add(EntityConversionUtil.createChampionTripMemberEntity(tripDTO));
		tripMemberDao.addTripMembers(tripMembers);		
	}	
	
		
	public TripDTO readTripById(Integer tripId, Integer userId){
		Trip trip = tripDao.readTripById(tripId);		
		List<TripMemberDTO> tripMemberDTOList = tripMemberDao.getTripMembersByTripId(tripId);
		return createTripDTO(trip, tripMemberDTOList, userId);
	}
	

	public List <Trip> readTripByChampion(Integer tripChampion){
		List<Trip> trips = tripDao.readTripByChampion(tripChampion);	
		return trips;
	}
	

	public List <Trip> getUserTrips(Integer userId){
		List<Trip> trips = tripDao.getUserTrips(userId)	;
		return trips;
	}
	
	
	
	public boolean updatetripById (Integer id, Trip trip) {
		return tripDao.updateTripById(trip) == 1;
	}
	
	private TripDTO createTripDTO(Trip trip, List<TripMemberDTO> tripMemberDTOList, Integer userId){
		TripDTO tripDTO = new TripDTO();
		tripDTO.setTripId(trip.getId());
		tripDTO.setTripName(trip.getTripName());
		tripDTO.setTripDestination(trip.getTripDestination());
		tripDTO.setTripDestinationLat(trip.getTripDestinationLat());
		tripDTO.setTripDestinationLong(trip.getTripDestinationLong());
		tripDTO.setChampionUserId(trip.getTripChampion());
		tripDTO.setStartTime(trip.getStartTime());
		tripDTO.setEndTime(trip.getEndTime());
		tripDTO.setTripMembers(tripMemberDTOList);
		for(TripMemberDTO tripMemberDTO:tripMemberDTOList){
			if(userId == tripMemberDTO.getMemberId()){
				tripDTO.setStartLocationForCurrentUser(tripMemberDTO.getCurrentLocation());
				tripDTO.setStartLocationForCurrentUserLat(tripMemberDTO.getCurrentLocationLat());
				tripDTO.setStartLocationForCurrentUserLong(tripMemberDTO.getCurrentLocationLong());
				break;
			}
		}
		return tripDTO;
	}

}
