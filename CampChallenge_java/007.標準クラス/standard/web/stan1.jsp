<%-- 
    Document   : stan1
    Created on : 2016/09/18, 15:11:08
    Author     : wappen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
    </body>
</html>
<%
//１．2016年1月1日 0時0分0秒のタイムスタンプを作成し、表示してください。

Calendar cal = Calendar.getInstance();
cal.set(2016,0,1,0,0,0);
Date c = cal.getTime();
out.print(c.getTime());
%>