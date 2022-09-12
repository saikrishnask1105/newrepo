package com.dependencyProperties;

public class Student {
	
	private String name ;
	private String course ;
	private String hobbies ;
	

	public void setName(String name) {
		this.name = name;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public void print()
	{
		System.out.println("name is :" + name);
		System.out.println("intrestredCourse : " + course);
		System.out.println("hobbies : " + hobbies);
	}

}
