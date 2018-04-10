<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>

<form:form action="processForm" modelAttribute="customer">

First Name: <form:input path="firstName" />

<br><br>

Last Name(*): <form:input path="lastName" />
<form:errors path="lastName" cssClass="error" />

<br><br>

<input type="submit" value="Submit">

</form:form>

</html>