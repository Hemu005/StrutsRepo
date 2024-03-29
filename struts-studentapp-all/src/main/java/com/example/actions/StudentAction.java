package com.example.actions;

import java.util.Arrays;
import java.util.List;

import com.example.model.Student;
import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport{

	//create the student object populate the values
	private Student student;
	
	//create a list to populate the values of the hobbies array
	private List<String> hobbies;

	//create getter and setter for both properties
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public List<String> getHobbies() {
		return hobbies;
	}
	
	//create  a constructor
	public StudentAction() {
		hobbies = Arrays.asList("Sports","Dance","Music");
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = Arrays.asList("Sports","Dance","Music");
	}
	
	public String showStudForm() {
		return "none";
	}

	@Override
	public String execute() throws Exception {
		if(student.getName().equals("Hemu"))
			return "success";
		return "error";
	}
	
	
}
