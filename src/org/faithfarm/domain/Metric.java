package org.faithfarm.domain;

import java.io.Serializable;

public class Metric implements Serializable {

	private long metricId;
	private long programId;
	private String metricName="";
	private String description="";
	private String status="";
	private String creationDate="";
	private String createdBy="";
	private Program program= new Program();
	
	public long getMetricId() {
		return metricId;
	}
	public void setMetricId(long metricId) {
		this.metricId = metricId;
	}
	public long getProgramId() {
		return programId;
	}
	public void setProgramId(long programId) {
		this.programId = programId;
	}
	public String getMetricName() {
		return metricName;
	}
	public void setMetricName(String metricName) {
		this.metricName = metricName;
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
	public Program getProgram() {
		return program;
	}
	public void setProgram(Program program) {
		this.program = program;
	}
	
	
	
}
