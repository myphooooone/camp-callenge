<%-- 
    Document   : kadai5
    Created on : 2016/09/08, 16:19:23
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
int tasi=0 ;

for(int i=1; i<=100; i++){
tasi += i ;

}

out.println(tasi);
%>