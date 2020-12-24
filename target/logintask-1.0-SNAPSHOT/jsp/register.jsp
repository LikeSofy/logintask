<%--
  Created by IntelliJ IDEA.
  User: margu
  Date: 12/22/2020
  Time: 3:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html><head><title>Login</title></head>
<body>
<form name="registerForm" method="POST" action="controller">
    <input type="hidden" name="command" value="register" />
    Registration:<br/>
    Login:<br/>
    <input type="text" name="login" value=""/>
    <br/>Password:<br/>
    <input type="password" name="password" value=""/>
    <br/>
    ${errorRegistrationMessage}
    <br/>
    ${wrongAction}
    <br/>
    ${nullPage}
    <br/>
    <input type="submit" value="Register in"/>
</form><hr/>
</body></html>
