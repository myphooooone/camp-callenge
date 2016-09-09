<%-- 
    Document   : index
    Created on : 2016/09/08, 14:48:02
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
char moji='A';
String message2 ="";

switch(moji){
      case 'A':
        message2="英語";
        break;
      
      case 'あ':
        message2="日本語";
        break;     
}
out.print(message2);

%>