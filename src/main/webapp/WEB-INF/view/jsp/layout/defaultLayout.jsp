<%--
  Created by IntelliJ IDEA.
  User: tomas
  Date: 16.2.2018
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
    <title><tiles:insertAttribute name="title" /></title>
</head>
<body>
<header>
    <tiles:insertAttribute name="header" />
</header>
<section>
    <tiles:insertAttribute name="menu" />
</section>
<section>
    <tiles:insertAttribute name="content" />
</section>
<footer>
    <tiles:insertAttribute name="footer" />
</footer>
</body>
</html>
