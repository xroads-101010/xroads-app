package com.xroads.resource;

import java.util.List;

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
import com.xroads.dto.Credential;

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
	
	@Path("/validate")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces(MediaType.APPLICATION_JSON)
	public Response validateUser(Credential credential)
	{
		User user = userDao.validateUser(credential);
		if(user!=null)
		return Response.ok(user).build();
		else 
		return Response.ok("0").build();
		
	}
	
	@POST 
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})	
	public Response createUser(User user) {	
		userDao.createUser(user);	
		return Response.ok(user.getId()).build();		
	}
	
	@Path("/allUsers")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllUsers(){
		List<User> users = userDao.getAllUsers();
		return Response.ok(users).build();
	}
	
	
}
