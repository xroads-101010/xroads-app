package com.xroads.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xroads.dao.entities.Trip;
import com.xroads.dto.TripDTO;
import com.xroads.service.TripService;


@Component
@Path("/trip")
public class TripResource {

	@Autowired
	TripService tripService;
		

	@POST 
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.TEXT_HTML})	
	public Response newTrip(TripDTO tripDTO ) {
		
		tripService.newTrip(tripDTO);
		return Response.status(201).entity("A new trip has been added").build(); 		
	}	
	
	
	@SuppressWarnings("unchecked")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getTripById(@QueryParam("tripId") Integer tripId, @QueryParam("userId") Integer userId){
		TripDTO TripDTO = tripService.readTripById(tripId,userId);
		JSONObject mainObj = new JSONObject();
		mainObj.put("trip",  TripDTO);
		return Response.ok(mainObj).build();
	}
	

	/**
	 * Get the trip details of trips that the user is part of
	 * If tripChampion is 
	 * 			True - Retrieve only trips for which this user is a champion
	 * 			False - Retrieve all trips that the user is a member of
	 * @param userId
	 * @param tripChampion
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@GET @Path("{user}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response getUserTrips(@QueryParam("userId") Integer userId, @QueryParam("tripChampion") Boolean tripChampion){
		List<Trip> trips;
		if(tripChampion){
			trips = tripService.readTripByChampion(userId);
		}else{
			trips = tripService.getUserTrips(userId);
		}
		JSONObject mainObj = new JSONObject();
		mainObj.put("trips",  trips);
		return Response.ok(mainObj).build();
	}
	
	@PUT @Path("{id}")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.TEXT_HTML})	

	public Response updatetripById(@PathParam("id") Integer id, Trip t) {
		
		String message=""; 
		int status=0;
		 
		if(t.getId() == 0) t.setId(id);
		
		if(tripService.updatetripById(id,t)){
			status = 200; //OK
			message = "trip has been updated";
		} 
		
		else {
			status = 406; //Not acceptable
			message = "The information you provided is not sufficient to perform either an UPDATE or "
					+ " an INSERTION of the new trip  <br/>"
					+ " If you want to UPDATE please make sure you provide an existent <strong>id</strong> <br/>";
		}
			
		return Response.status(status).entity(message).build();			
	
	}
	

}
