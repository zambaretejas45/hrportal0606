package com.hrportal.main.pojo;

import java.time.LocalDate;

public class ProjectMaster {

	private int projectId;
	private String projectName;
	private LocalDate startdate;
	private LocalDate endDate;
	
	public ProjectMaster() {
		// TODO Auto-generated constructor stub
	}

	public ProjectMaster(int projectId, String projectName, LocalDate startdate, LocalDate endDate) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.startdate = startdate;
		this.endDate = endDate;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public LocalDate getStartdate() {
		return startdate;
	}

	public void setStartdate(LocalDate startdate) {
		this.startdate = startdate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "ProjectMaster [projectId=" + projectId + ", projectName=" + projectName + ", startdate=" + startdate
				+ ", endDate=" + endDate + "]";
	}
	
	
	
	
}
