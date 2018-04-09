 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<body>

	The name of the student is ${student.firstName} ${student.lastName} 
	
	<br><br>
	
	The student's country is ${student.country}
	
	<br><br>
	
	The student's favorite programming language is ${student.programmingLanguage}
	
	<br><br>
	
	The student's favorite operating systems are:
	
	<ul>
	
		<c:forEach var="item" items="${student.favoriteOperatingSystems}">
         	<li>${item}</li>
		</c:forEach>
  		
	</ul>
	 
	
</body>


</html>