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
   <h2>Student Form</h2>
   <s:form action="register">
   <s:textfield key="student.name" ></s:textfield>
   <s:textfield key="student.city" ></s:textfield>
   <s:textfield key="student.age" ></s:textfield>
   <s:textfield key="student.stipend"></s:textfield>
   <s:select key="student.course" list="{'Java','Spring','Angular'}"></s:select>
   <s:radio key="student.gender" list="{'Male','Female'}"></s:radio>
   <s:textfield key="student.email"></s:textfield>
   <s:checkboxlist key="student.hobby" list="hobbies"></s:checkboxlist>
   <s:submit value="Register"></s:submit>
   </s:form>
</body>
</html>