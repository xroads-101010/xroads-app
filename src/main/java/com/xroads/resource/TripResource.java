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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



import com.xroads.dao.TripDao;
import com.xroads.dao.entities.Trip;


@Component
@Path("/trip")
public class TripResource {

	@Autowired
	TripDao tripDao;
	

	@POST 
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.TEXT_HTML})	
	public Response NewTrip(Trip trip) {
	
		tripDao.createTrip(trip);	
		return Response.status(201).entity("A new trip has been added").build(); 		
	}	
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getTripById(@QueryParam("id") Integer id){
		Trip trip = tripDao.readTripById(id);
		return Response.ok(trip).build();
	}
	
	@GET @Path("{champion}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response getTripByChampion(@QueryParam("id") Integer tripChampion){
		List<Trip> trips = tripDao.readTripByChampion(tripChampion);
		return Response.ok(trips).build();
	}
	
	
	
	@PUT @Path("{id}")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.TEXT_HTML})	

	public Response updatetripById(@PathParam("id") Integer id, Trip t) {
		
		String message=""; 
		int status=0;
		 
		if(t.getId() == 0) t.setId(id);
		
		if(tripWasUpdated(id,t)){
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
	
	private boolean tripWasUpdated(Integer id, Trip trip) {
		return tripDao.updateTripById(trip) == 1;
	}


}
