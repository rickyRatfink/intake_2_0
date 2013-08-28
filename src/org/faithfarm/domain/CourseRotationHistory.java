package org.faithfarm.domain;

import java.io.Serializable;

public class CourseRotationHistory implements Serializable {

	private Long rotationId = new Long("0");
	private int moved_course_0_to_1=0;
	private int moved_course_1_to_2=0;
	private int moved_course_2_to_3=0;
	private int moved_course_3_to_4=0;
	private int moved_course_4_to_5=0;
	private int moved_course_5_to_6=0;
	private int held_course_0=0;
	private int held_course_1=0;
	private int held_course_2=0;
	private int held_course_3=0;
	private int held_course_4=0;
	private int held_course_5=0;
	private int held_course_6=0;
	private int graduated=0;
	private String rotationDate="";
	private String createdBy="";
	
	public Long getRotationId() {
		return rotationId;
	}
	public void setRotationId(Long rotationId) {
		this.rotationId = rotationId;
	}
	public int getMoved_course_0_to_1() {
		return moved_course_0_to_1;
	}
	public void setMoved_course_0_to_1(int moved_course_0_to_1) {
		this.moved_course_0_to_1 = moved_course_0_to_1;
	}
	public int getMoved_course_1_to_2() {
		return moved_course_1_to_2;
	}
	public void setMoved_course_1_to_2(int moved_course_1_to_2) {
		this.moved_course_1_to_2 = moved_course_1_to_2;
	}
	public int getMoved_course_2_to_3() {
		return moved_course_2_to_3;
	}
	public void setMoved_course_2_to_3(int moved_course_2_to_3) {
		this.moved_course_2_to_3 = moved_course_2_to_3;
	}
	public int getMoved_course_3_to_4() {
		return moved_course_3_to_4;
	}
	public void setMoved_course_3_to_4(int moved_course_3_to_4) {
		this.moved_course_3_to_4 = moved_course_3_to_4;
	}
	public int getMoved_course_4_to_5() {
		return moved_course_4_to_5;
	}
	public void setMoved_course_4_to_5(int moved_course_4_to_5) {
		this.moved_course_4_to_5 = moved_course_4_to_5;
	}
	public int getMoved_course_5_to_6() {
		return moved_course_5_to_6;
	}
	public void setMoved_course_5_to_6(int moved_course_5_to_6) {
		this.moved_course_5_to_6 = moved_course_5_to_6;
	}
	public int getHeld_course_0() {
		return held_course_0;
	}
	public void setHeld_course_0(int held_course_0) {
		this.held_course_0 = held_course_0;
	}
	public int getHeld_course_1() {
		return held_course_1;
	}
	public void setHeld_course_1(int held_course_1) {
		this.held_course_1 = held_course_1;
	}
	public int getHeld_course_2() {
		return held_course_2;
	}
	public void setHeld_course_2(int held_course_2) {
		this.held_course_2 = held_course_2;
	}
	public int getHeld_course_3() {
		return held_course_3;
	}
	public void setHeld_course_3(int held_course_3) {
		this.held_course_3 = held_course_3;
	}
	public int getHeld_course_4() {
		return held_course_4;
	}
	public void setHeld_course_4(int held_course_4) {
		this.held_course_4 = held_course_4;
	}
	public int getHeld_course_5() {
		return held_course_5;
	}
	public void setHeld_course_5(int held_course_5) {
		this.held_course_5 = held_course_5;
	}
	public int getHeld_course_6() {
		return held_course_6;
	}
	public void setHeld_course_6(int held_course_6) {
		this.held_course_6 = held_course_6;
	}
	public int getGraduated() {
		return graduated;
	}
	public void setGraduated(int graduated) {
		this.graduated = graduated;
	}
	public String getRotationDate() {
		return rotationDate;
	}
	public void setRotationDate(String rotationDate) {
		this.rotationDate = rotationDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	
	
}
