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
	
	
	
	
}
