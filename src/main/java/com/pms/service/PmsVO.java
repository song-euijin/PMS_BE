package com.pms.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PmsVO {

	private String projectIndex;
	private String projectName;
	private String projectDescription;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date projectStartDate;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date projectEndDate;
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	public Date getProjectStartDate() {
		return projectStartDate;
	}
	public void setProjectStartDate(Date projectStartDate) {
		this.projectStartDate = projectStartDate;
	}
	public Date getProjectEndDate() {
		return projectEndDate;
	}
	public void setProjectEndDate(Date projectEndDate) {
		this.projectEndDate = projectEndDate;
	}
	public String getProjectIndex() {
		return projectIndex;
	}
	public void setProjectIndex(String projectIndex) {
		this.projectIndex = projectIndex;
	}
	@Override
	public String toString() {
		return "PmsVO [projectName=" + projectName + ", projectDescription=" + projectDescription
				+ ", projectStratDate=" + projectStartDate + ", projectEndDate=" + projectEndDate + "]";
	}
	
	
	
}
