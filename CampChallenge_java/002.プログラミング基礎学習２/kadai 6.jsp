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
    <%
int key = 1000;
int i = 0;

while(key >=100){
    
       key = key / 2;
       i++;
       out.println(i + " は " + key);
       %><br><%
   
}
%>
</html>
