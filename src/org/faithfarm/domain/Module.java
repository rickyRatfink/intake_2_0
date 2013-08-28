package org.faithfarm.domain;

import java.io.Serializable;

public class Module implements Serializable {

	private long moduleId;
	private Long[] metricId = new Long[4];
	private String ModuleName="";
	private String description="";
	private String status="";
	private String creationDate="";
	private String createdBy="";
	private String meetingDays="";
	private String meetingTimes="";
	private String meetingLocation="";
	private Long instructorId;
	private String instructorName;
	
	public String getInstructorName() {
		return instructorName;
	}
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	public long getModuleId() {
		return moduleId;
	}
	public void setModuleId(long moduleId) {
		this.moduleId = moduleId;
	}
	public Long[] getMetricId() {
		return metricId;
	}
	public void setMetricId(Long[] metricId) {
		this.metricId = metricId;
	}
	public String getModuleName() {
		return ModuleName;
	}
	public void setModuleName(String moduleName) {
		ModuleName = moduleName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getMeetingDays() {
		return meetingDays;
	}
	public void setMeetingDays(String meetingDays) {
		this.meetingDays = meetingDays;
	}
	public String getMeetingTimes() {
		return meetingTimes;
	}
	public void setMeetingTimes(String meetingTimes) {
		this.meetingTimes = meetingTimes;
	}
	public String getMeetingLocation() {
		return meetingLocation;
	}
	public void setMeetingLocation(String meetingLocation) {
		this.meetingLocation = meetingLocation;
	}
	public Long getInstructorId() {
		return instructorId;
	}
	public void setInstructorId(Long instructorId) {
		this.instructorId = instructorId;
	}
	

	
	
	
	
	
	
}
