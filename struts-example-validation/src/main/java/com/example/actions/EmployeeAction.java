package com.example.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.example.model.Employee;
import com.opensymphony.xwork2.ActionSupport;
@ResultPath(value="/WEB-INF/content/")
@Namespace("/")
public class EmployeeAction extends ActionSupport{
 
	private Employee employee;
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
    
	@Action(value="empregister",results= {
			@Result(name="success",location="empsuccess.jsp"),
			@Result(name="input",location="empform.jsp")
	})
	@Override
	public String execute() throws Exception {
		if(employee.getName().equals("Hemu"))
		     return SUCCESS;
		return INPUT;
	}
	
	@Override
	public void validate() {
		if(employee.getName().length()<=0)
			addFieldError("employee.name", "Name is required");
		if(employee.getAge()<20||employee.getAge()>70)
			addFieldError("employee.age", "Age should be between 21 and 70");
		if(employee.getCity().length()<=0)
			addFieldError("employee.city", "City is reqiured");
		if(employee.getSalary()<=0) 
			addFieldError("employee.salary", "Salary should be greater than zero");
		if(employee.getEmail().length()<=0)
			addFieldError("employee.email", "Email is required");
		if(!employee.getEmail().contains("@"))
			addFieldError("employee.email", "Email is not valid");
	}

}
