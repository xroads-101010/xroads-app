package com.xroads.dao;

import org.apache.ibatis.annotations.Param;

import com.xroads.dao.entities.User;

public interface UserDao {
	
	public User readUserByMobile(@Param("userMobile") String userMobile);

	public User readUserByEmail(@Param("email") String email);
	
	public long createUser(User user);
	
}
