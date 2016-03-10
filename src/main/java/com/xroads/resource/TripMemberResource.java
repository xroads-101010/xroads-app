package com.xroads.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xroads.dao.TripMemberDao;
import com.xroads.dao.entities.TripMember;

@Component
@Path("/tripmember")
public class TripMemberResource {
	
	@Autowired
	TripMemberDao tripMemberDao;
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getTripMembersByTripId(@QueryParam("tripId") Integer tripId){
		TripMember[] tripMembers = tripMemberDao.getTripMembersByTripId(tripId);
		return Response.ok(tripMembers).build();
	}
	
	@POST 
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.TEXT_HTML})	
	public Response addTripMembers(List<TripMember> tripMembers) {	
		tripMemberDao.addTripMembers(tripMembers);
		return Response.status(201).entity("Added members to the trip").build(); 		
	}	
	

	@PUT 
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.TEXT_HTML})	
	public Response updateTripMember(TripMember tripMember ) {	
        tripMemberDao.updateTripMember(tripMember);
		return Response.status(201).entity("Updated Member").build(); 		
	}


}
