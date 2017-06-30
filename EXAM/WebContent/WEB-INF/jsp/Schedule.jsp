<%@ page language="java" contentType="text/html; charset=ISO-8859-1"pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%> 

<%-- <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%> --%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.container{
border:1px black;
}
</style>
</head>
<body>


<div class="container">
		<h3>Schedule Training</h3>
		<br>
<form:form method="Post" modelAttribute="Schedule"  action="addSchedule"  >
<form:errors path="*"/>
<table>
<tr>

<td>Trainer Id:</td>
<td><form:input path="trainerId" name="trainerId"/></td>
<td><form:errors  path="trainerId"/></td>

<td>Trainer name:</td>
<td><form:input path="trainerName" name="trainerName"/>
<form:errors path="trainerName"/></td>
</tr>
 <tr colspan=2>

<td>college Name:</td>
<td><form:input path="collegeName"  name="collegeName"/></td>
<td><form:errors path="collegeName"/></td>
<td>domain:</td>
<td><form:select  path="domain" name="domain">
<form:option value="java" >java</form:option>
<form:option value="DotNet" >DotNet</form:option>

</form:select>

<td><form:errors path="domain"/></td>
</td>

</tr>
<tr colspan=2>

<td>start date:</td>
<td>
<input type="text" path="startDate" class= "date" name = "startDate" />
</td>
<%-- <td><form:input path="startDate" name="startDate" /> --%>
<td><form:errors path="startDate"/></td>
<td>duration:</td>
<td><form:select  path="duration" name="duration">
<form:option value="120" >120</form:option>
<form:option value="180" >180</form:option>
<form:option value="240" >240</form:option>
<form:option value="300" >300</form:option>
</form:select>
<td><form:errors path="duration"/></td>
</td>
</tr>
<tr>
<td>
<input type="submit" value="submit"/>
</td>
<td>
<input type="reset" value="Reset"/>
</td>
</tr>
</table>
</form:form>
</div>
</body>
</html>