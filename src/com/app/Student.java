package com.app;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Student {
	
	private int sid;
	private String sname;
	public Student() {
		super();
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	
	public static void main(String[] args) throws JsonMappingException, IOException {
		Student s=new Student();
		s.setSid(3);
		s.setSname("A");
		ObjectMapper om=new ObjectMapper();
		
		try {
			String jason=om.writeValueAsString(s);
			System.out.println(jason);
		} catch (JsonGenerationException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	

}
