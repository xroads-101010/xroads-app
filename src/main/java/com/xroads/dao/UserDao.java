package com.xroads.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xroads.dao.entities.User;
import com.xroads.dto.Credential;

public interface UserDao {
	
	public User readUserByMobile(@Param("userMobile") String userMobile);

	public User readUserByEmail(@Param("email") String email);
	
	public long createUser(User user);
	

	public User validateUser(Credential credential);

	public List<User> getAllUsers();
	

}
