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
Name:<s:property value="name"/><br>
Message:<s:property value="message"/><br>
Fruits:<s:property value="fruits"/><br>
Session Message:<s:property value="#session.message"/><br>
Session Courses:<s:property value="#session.courses"/><br>
</body>
</html>