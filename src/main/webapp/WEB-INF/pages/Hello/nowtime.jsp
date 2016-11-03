<%@ page import="java.util.Date" %>
<%@ page import="java.time.LocalTime" %><%--
  Created by IntelliJ IDEA.
  User: MingGong
  Date: 2016/11/3
  Time: 21:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
    Now is <%= LocalTime.now().toString() %>
</body>
</html>
