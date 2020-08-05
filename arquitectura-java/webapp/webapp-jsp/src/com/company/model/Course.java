package com.company.model;

public class Course {

	private String name;

	private int level;

	public Course(String name, int level) {
		super();
		this.name = name;
		this.level = level;
	}

	public Course() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}
