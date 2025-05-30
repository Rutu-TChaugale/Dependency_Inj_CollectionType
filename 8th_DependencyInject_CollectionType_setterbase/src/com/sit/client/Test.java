package com.sit.client;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sit.model.Student;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("beans.xml");
		Student student = ap.getBean(Student.class);
		System.out.println(student.getRollno());
		System.out.println(student.getName());
		System.out.println(student.getAddr());
		System.out.println(student.getEmail());
		
		List<String> sub = student.getSubject();
		for (String s : sub) {
			System.out.println(s);
		}
		System.out.println("_________________________________________");
		Set<String> mno = student.getMobileno();
		for (String m : mno) {
			System.out.println(m);
		}
		System.out.println("___________________________________________");
		
		Map<String, String> c = student.getCourse();
		Set<String> keySet = c.keySet();
		System.out.println(keySet);
		for (String key : keySet) {
			System.out.println(key);
			
			String val = c.get(key);
			System.out.println(val);
		}
	}

}
