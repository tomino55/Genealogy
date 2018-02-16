<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Prihlasenie</title>
</head>
<body>
<form action="/login" method="post">
    <label for="email">Používateľské meno</label>
    <input id="email" name="email" type="email" required="required"/>

    <label path="password" for="password">Heslo</label>
    <input id="password" name="password" type="password" required="required"/>

    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
    <input type="submit" value="Prihlas" />
</form>
</body>
</html>