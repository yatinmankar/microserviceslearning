package com.springmvc.model;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Size;

public class Student {

	public Student(){
		
	}
	/*public Student(String studentName, String studentHobby) {
		//super();
		this.studentName = studentName;
		this.studentHobby = studentHobby;
	}*/
	@Size(min=7, max=30)
	private String studentName;
/*	@Size(min=2, max=30, message=" Student name should be between 2 to 30 character")
*/	
	@Size(min=5, max=30)
	private String studentHobby;
	private long studentMobile;
	private List<String> studentSkills;
	private Date studentDOB;
	private Address addr;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentHobby() {
		return studentHobby;
	}
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
	public long getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(long studentMobile) {
		this.studentMobile = studentMobile;
	}
	public List<String> getStudentSkills() {
		return studentSkills;
	}
	public void setStudentSkills(List<String> studentSkills) {
		this.studentSkills = studentSkills;
	}
	public Date getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	
	
}
