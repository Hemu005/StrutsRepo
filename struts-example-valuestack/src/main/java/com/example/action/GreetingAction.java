package com.example.action;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class GreetingAction extends ActionSupport implements SessionAware{

	private static final long serialVersionUID=1L;
	private String name;
	private Map<String, Object> userSession;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, Object> getUserSession() {
		return userSession;
	}
	public void setUserSession(Map<String, Object> userSession) {
		this.userSession = userSession;
	}
	@Override
	public String execute() throws Exception {
		//create valuestack
		ValueStack stack= ActionContext.getContext().getValueStack();
		//create key value pair
		Map<String, Object> mapData=new HashMap<String, Object>();
		mapData.put("message", "Great Day");
		mapData.put("fruits", Arrays.asList("apple","orange"));
	
		//add them to the valuestack
		stack.push(mapData);
		System.out.println(stack.size());
		userSession.put("message", "greatday");
		userSession.put("courses", Arrays.asList("java","spring"));
		return SUCCESS;
	}
	public void setSession(Map<String, Object> session) {
       userSession=session;
	}
	
	
}
