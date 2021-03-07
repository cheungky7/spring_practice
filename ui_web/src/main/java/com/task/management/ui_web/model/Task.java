 package com.task.management.ui_web.model;

//import java.time.LocalDate;
import java.time.LocalDateTime;
//import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Task {
	
	//private String  deadline;
	//private String  assignedDate;
	@DateTimeFormat(iso =  DateTimeFormat.ISO.DATE_TIME)
	private LocalDateTime deadline;
	
	@DateTimeFormat(iso =  DateTimeFormat.ISO.DATE_TIME)
	private LocalDateTime assignedDate;
	
	private String title;
	private String content;
	private String assignedTo;
	private String assignedBy;
	public LocalDateTime getDeadline() {
		return deadline;
	}
	public void setDeadline(LocalDateTime deadline) {
		this.deadline = deadline;
	}
	public LocalDateTime getAssignedDate() {
		return assignedDate;
	}
	public void setAssignedDate(LocalDateTime assignedDate) {
		this.assignedDate = assignedDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAssignedTo() {
		return assignedTo;
	}
	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}
	public String getAssignedBy() {
		return assignedBy;
	}
	public void setAssignedBy(String assignedBy) {
		this.assignedBy = assignedBy;
	}

}
