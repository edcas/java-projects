package com.company.service;

import java.util.ArrayList;
import java.util.List;

import com.company.model.Course;

public class CourseServiceSteroids {

	private static List<Course> courses = new ArrayList<Course>();

	static {
		Course c1 = new Course("java", 1);
		Course c2 = new Course("net", 1);
		Course c3 = new Course("php", 2);

		courses.add(c1);
		courses.add(c2);
		courses.add(c3);
	}

	public Course get(String nombre) {

		for (Course c : courses) {
			if (c.getName().equals(nombre)) {
				return c;
			}
		}
		
		return null;
	}

	public List<Course> all() {
		return courses;
	}
}
