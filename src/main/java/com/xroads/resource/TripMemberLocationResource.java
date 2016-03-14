package com.xroads.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xroads.dao.TripMemberDao;
import com.xroads.dao.TripMemberLocationDao;
import com.xroads.dao.entities.TripMember;
import com.xroads.dao.entities.TripMemberLocation;
import com.xroads.dto.TripMemberLocationDto;

@Path("/location")
@Component
public class TripMemberLocationResource {
	
	@Autowired
	TripMemberLocationDao tripMemberLocationDao;
	
	@Autowired
	TripMemberDao tripMemberDao;
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addTripMemberLocation(TripMemberLocationDto tripMemberLocationDto ){
		
		List<TripMember> tripMemberDTOList = tripMemberDao.getActiveTripMembersByUserId(tripMemberLocationDto.getMemberId());
		List<TripMemberLocation> tripMemberLocationDTOList = new ArrayList<TripMemberLocation>();

		for (TripMember tripMember:tripMemberDTOList){
			TripMemberLocation tripMemberLocation = null;
			tripMemberLocation = new TripMemberLocation();
			tripMemberLocation.setTripMemberId(tripMember.getId());
			tripMemberLocation.setCurrentLocation(tripMemberLocationDto.getLocation());
			tripMemberLocation.setCurrentLocationLat(tripMemberLocationDto.getLocationLat());
			tripMemberLocation.setCurrentLocationLong(tripMemberLocationDto.getLocationLong());
			tripMemberLocation.setCreatedAt(new DateTime());
			tripMemberLocation.setUpdatedAt(new DateTime());
			tripMemberLocationDTOList.add(tripMemberLocation);
		}			
		
		tripMemberLocationDao.addOrUpdateMemberLocation(tripMemberLocationDTOList);
		return Response.ok().build();
	}
	
	@GET
	public Response getTripMembersLocation(@QueryParam("trip_id") String tripId){
		return Response.ok().build();
	}

}
