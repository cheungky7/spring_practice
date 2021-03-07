package com.task.management.ui_web.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.management.ui_web.dao.mapper.TaskMapper;
import com.task.management.ui_web.model.Task;


@Service
public class TasksService {
	
	@Autowired
	private TaskMapper taskMapper;
	
	
	public void addNewTask(Task task)
	{
		task.setAssignedDate(LocalDateTime.now());
		taskMapper.insert(task);
	}

}
