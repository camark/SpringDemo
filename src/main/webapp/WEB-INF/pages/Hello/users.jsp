<%@ page import="comg.m.DTO.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: MingGong
  Date: 2016/11/3
  Time: 22:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Users</title>
</head>
<body>

<table>
     <%  List<User> users= (List<User>) request.getAttribute("users");
         for (User user:users) { %>
             <tr>
                <td> <%= user.getNickname() %> </td><td> <%= user.getFirst_name() %> </td><td><%= user.getLast_name() %></td>
             </tr>
         <% } %>
</table>
</body>
</html>
