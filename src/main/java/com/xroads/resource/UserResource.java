package com.xroads.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xroads.dao.UserDao;
import com.xroads.dao.entities.User;

@Component
@Path("/user")
public class UserResource {
	
	@Autowired
	UserDao userDao;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUserByEmail(@QueryParam("email") String email){
		User user = userDao.readUserByEmail(email);
		return Response.ok(user).build();
	}

}
