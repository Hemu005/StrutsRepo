<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h2>WELCOME</h2>
  <br><s:property value="employee.employeeName"/><br>
  <s:property value="employee.employeeId"/><br>
  <s:property value="employee.salary"/>
</body>
</html>