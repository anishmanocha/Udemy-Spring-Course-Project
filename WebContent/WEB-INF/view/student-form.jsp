<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>

<form:form action="processForm" modelAttribute="student">
	
	First Name: <form:input path="firstName"/>
        
	<br><br>
        
    Last Name: <form:input path="lastName"/>
        		
    <br><br>
        
        
    <form:select path="country">
    		<form:options items="${student.countryOptions}"/>
    	</form:select>
        
    <input type="submit" value="Submit"/>
        
     
</form:form>


</html>