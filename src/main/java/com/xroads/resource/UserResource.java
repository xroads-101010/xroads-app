package com.xroads.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.xroads.dao.UserDao;
import com.xroads.dao.entities.User;

@Component
@Path("/user")
public class UserResource {
	
	@Autowired
	UserDao userDao;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUser(@QueryParam("userMobile") String userMobile, @QueryParam("email") String email){
		User user = null;
		if(!StringUtils.isEmpty(userMobile)){
			user = userDao.readUserByMobile(userMobile);
		}else if(!StringUtils.isEmpty(email)){
			user = userDao.readUserByEmail(email);
		}		
		return Response.ok(user).build();
	}
	

	@POST 
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.TEXT_HTML})	
	public Response createUser(User user) {	
		userDao.createUser(user);	
		return Response.status(201).entity("User Registered").build(); 		
	}
	
}
