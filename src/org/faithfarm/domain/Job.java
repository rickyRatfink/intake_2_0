package org.faithfarm.domain;

import java.io.Serializable;

public class Job implements Serializable {
	
	private Long jobId;
	private Long departmentId;
	private String departmentTitle="";
	private String farmBase="";
	private Long[] metricId = new Long[]{};
	
	public String getFarmBase() {
		return farmBase;
	}
	public void setFarmBase(String farmBase) {
		this.farmBase = farmBase;
	}
	private String title="";
	private String description="";
	private String creationDate="";
	private String createdBy="";
	
	public Long getJobId() {
		return jobId;
	}
	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}
	
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	
	public String getDepartmentTitle() {
		return departmentTitle;
	}
	public void setDepartmentTitle(String departmentTitle) {
		this.departmentTitle = departmentTitle;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public Long[] getMetricId() {
		return metricId;
	}
	public void setMetricId(Long[] metricId) {
		this.metricId = metricId;
	}
	
	

}
