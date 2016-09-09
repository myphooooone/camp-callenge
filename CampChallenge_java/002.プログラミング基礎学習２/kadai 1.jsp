<%-- 
    Document   : index
    Created on : 2016/09/08, 15:02:09
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
    
int num=1; String message="";


switch(num){
    case 1:
        message="one";
        break;
    
    case 2:
        message="two";
        break;
    
    default:
        message="想定外";
        break;
}       
  out.println(message);
       
%>