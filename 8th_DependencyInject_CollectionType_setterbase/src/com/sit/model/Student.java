package com.sit.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	
	private int rollno;
	private String name;
	private String email;
	private String addr;
	
	private List<String> subject;
	private Set<String> mobileno;
	private Map<String, String> course;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public List<String> getSubject() {
		return subject;
	}
	public void setSubject(List<String> subject) {
		this.subject = subject;
	}
	public Set<String> getMobileno() {
		return mobileno;
	}
	public void setMobileno(Set<String> mobileno) {
		this.mobileno = mobileno;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	
	

}
