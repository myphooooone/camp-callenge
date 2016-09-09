<%-- 
    Document   : kadai8
    Created on : 2016/09/09, 11:11:39
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
<%
String nArr[]={"10","100","soeda","hayasi","-20","118","end"};

out.println(nArr[2]);

nArr[2]="33";



out.println(nArr[2]);


%>
