package com.task.management.ui_web.dao.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.task.management.ui_web.model.Task;

@Mapper
public interface TaskMapper {
	
	 public void insert(Task task);

}
