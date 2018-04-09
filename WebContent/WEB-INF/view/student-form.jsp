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
    	
    	<br><br>
    	
    	
    	JAVA <form:radiobutton path="programmingLanguage" value= "JAVA"/>
    	C# <form:radiobutton path="programmingLanguage" value= "C#"/>
    	PHP <form:radiobutton path="programmingLanguage" value= "PHP"/>
    	Ruby <form:radiobutton path="programmingLanguage" value= "Ruby"/>
    	
    	<br><br>
    	
    	Windows: <form:checkbox path="favoriteOperatingSystems" value="Windows"/>
	Mac OS: <form:checkbox path="favoriteOperatingSystems" value="MacOS"/>
	Linux: <form:checkbox path="favoriteOperatingSystems" value="Linux"/>
    
        
    <input type="submit" value="Submit"/>
        
     
</form:form>


</html>