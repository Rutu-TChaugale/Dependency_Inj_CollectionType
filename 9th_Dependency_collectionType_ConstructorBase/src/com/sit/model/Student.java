package com.sit.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	
	private int id;
	private String name;
	private String email;
	private String addr;
	
	private List<String> subject;
	private Set<String> mobileno;
	private Map<String, String> cource;
	
	public Student(int id, String name, String email, String addr, List<String> subject, Set<String> mobileno,
			Map<String, String> cource) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.addr = addr;
		this.subject = subject;
		this.mobileno = mobileno;
		this.cource = cource;
	}
	
	

	public Student() {
		super();
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", addr=" + addr + ", subject=" + subject
				+ ", mobileno=" + mobileno + ", cource=" + cource + "]";
	}
	
	

}
