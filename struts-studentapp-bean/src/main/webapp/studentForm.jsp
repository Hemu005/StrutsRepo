<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>        
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <s:form action="details">
    <s:textfield name="student.studentName" label="StudentName"></s:textfield>
    <s:textfield name="student.studentId" label="StudentId"></s:textfield>
    <s:textfield name="student.dept" label="Depatment"></s:textfield>
    <s:textfield name="student.city" label="City"></s:textfield>
    <s:submit value="submit"></s:submit>
    </s:form>
</body>
</html>