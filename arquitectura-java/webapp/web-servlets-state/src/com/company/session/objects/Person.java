package com.company.session.objects;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private String name;
	
	private List<String> courses = new ArrayList<String>();
	
	public Person(String name) {
		super();
		this.name = name;
	}

	public Person(String name, List<String> courses) {
		super();
		this.name = name;
		this.courses = courses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public void addCourse(String course) {

		courses.add(course);
	}

	public void removeCourse(String course) {
		courses.remove(course);
	}

}
