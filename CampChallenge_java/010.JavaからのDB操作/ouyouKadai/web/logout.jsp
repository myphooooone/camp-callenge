<%--

ログアウトページ    

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        ログアウトしました
        
        <a href="login.jsp">戻る</a>
    </body>
</html>
<%
session.invalidate();

%>