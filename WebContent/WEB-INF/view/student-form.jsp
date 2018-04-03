<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>

<form:form method="POST" action="../student/processStudent" modelAttribute="student">
	<table>
		<tr>
        		<td><form:label path="firstName">First Name</form:label></td>
            <td><form:input path="firstName"/></td>
        </tr>
        <tr>
        		<td><form:label path="lastName">Last Name</form:label></td>
        		<td><form:input path="lastName"/></td>
        </tr>
        <tr>
        		<td><input type="submit" value="Submit"/></td>
        </tr>
     </table>
</form:form>


</html>