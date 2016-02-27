package com.xroads.dao;

import org.apache.ibatis.annotations.Param;

import com.xroads.dao.entities.User;

public interface UserDao {
	
	User readUserByEmail(@Param("email") String email);

}
