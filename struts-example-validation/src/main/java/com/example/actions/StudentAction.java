package com.example.actions;

import java.util.Arrays;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.example.model.Student;
import com.opensymphony.xwork2.ActionSupport;

@ResultPath(value="/WEB-INF/content/")
@Action(value="/studregister",results= {
		@Result(name="success",location="studsuccess.jsp")
})
public class StudentAction extends ActionSupport{

	private static final long serialVersionUID=1L;
	private Student student;
	private List<String> hobbies;
	
	public StudentAction() {
		hobbies=Arrays.asList("sports","music");
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = Arrays.asList("sports","music");
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Action(value="studform",results= {
			@Result(name="none",location="/WEB-INF/content/studform.jsp"),
			@Result(name="input",location="studform.jsp"),
			@Result(name="error",location="studform.jsp")
	})
	@Override
	public String execute() throws Exception {
		if(student.getName().equals("Raju"))
		   return SUCCESS;
		return INPUT;
	}
	
	@Action(value="studform",results= {
			@Result(name="none",location="/WEB-INF/content/studform.jsp")
	})
	public String studForm() {
		return NONE;
	}
	
	  @Override public void validate() { 
		  if(student != null) {
			  if(student.getName().length()<=0)
		          addFieldError("student.name", "Name is required");
		       if(student.getAge()<18||student.getAge()>25)  
		    	   addFieldError("student.age","Age should be between 18 and 25");
		       if(student.getCity().length()<=0)
		           addFieldError("employee.city", "City is reqiured");
		       if(student.getAllowance()<=0)
		    	   addFieldError("student.allowance","Allowance should be greater than zero");
		       if(student.getEmail().length()<=0)
		           addFieldError("employee.email", "Email is required");
		       if(!student.getEmail().contains("@"))
			       addFieldError("employee.email","Email is not valid");
		  }
		 super.validate();
	       }
	 
}
