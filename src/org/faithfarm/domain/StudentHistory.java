package org.faithfarm.domain;

import java.io.Serializable;

public class StudentHistory implements Serializable {
	
	private Long studentHistoryId;
	private Long intakeId;
	private String farm="";
	private String phase="";
	private String programStatus="";
	private String beginDate="";
	private String endDate="";
	private String reason="";
	private String creationDate="";
	private String createdBy="";
	
	public Long getStudentHistoryId() {
		return studentHistoryId;
	}
	public void setStudentHistoryId(Long studentHistoryId) {
		this.studentHistoryId = studentHistoryId;
	}
	public Long getIntakeId() {
		return intakeId;
	}
	public void setIntakeId(Long intakeId) {
		this.intakeId = intakeId;
	}
	
	public String getFarm() {
		return farm;
	}
	public void setFarm(String farm) {
		this.farm = farm;
	}
	public String getPhase() {
		return phase;
	}
	public void setPhase(String phase) {
		this.phase = phase;
	}
	public String getProgramStatus() {
		return programStatus;
	}
	public void setProgramStatus(String programStatus) {
		this.programStatus = programStatus;
	}
	public String getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
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
	
	
}
