<%-- 
    Document   : kadai9
    Created on : 2016/09/09, 11:19:37
    Author     : wappen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>

<%@ page import="java.util.HashMap"%>

<%
HashMap<String,String>hmap=
   new HashMap<String,String>();

hmap.put("1","AAA");
hmap.put("hellow","world");
hmap.put("soeda","33");
hmap.put("20","20");



out.print(hmap.get("1"));%><br><%
    out.print(hmap.get("hellow"));%><br><%
        out.print(hmap.get("soeda"));%><br><%
            out.print(hmap.get("20"));%><br><%

%>