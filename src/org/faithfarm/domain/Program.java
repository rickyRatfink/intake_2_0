package org.faithfarm.domain;

import java.io.Serializable;

public class Program implements Serializable {

	private static long programId;
	private static String programName="";
	private static String description="";
	private static String status="";
	private static String creationDate="";
	private static String createdBy="";
	
	public static long getProgramId() {
		return programId;
	}
	public static void setProgramId(long programId) {
		Program.programId = programId;
	}
	public static String getProgramName() {
		return programName;
	}
	public static void setProgramName(String programName) {
		Program.programName = programName;
	}
	public static String getDescription() {
		return description;
	}
	public static void setDescription(String description) {
		Program.description = description;
	}
	public static String getStatus() {
		return status;
	}
	public static void setStatus(String status) {
		Program.status = status;
	}
	public static String getCreationDate() {
		return creationDate;
	}
	public static void setCreationDate(String creationDate) {
		Program.creationDate = creationDate;
	}
	public static String getCreatedBy() {
		return createdBy;
	}
	public static void setCreatedBy(String createdBy) {
		Program.createdBy = createdBy;
	}
	
	
}
