package com.task.management.ui_web.dao.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.task.management.ui_web.model.User;


@Mapper
public interface UserMapper {
	
	public User getUserByUsername(String username);

}
