<%-- 
    Document   : kadai10
    Created on : 2016/09/09, 13:14:01
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
        <%

//http://localhost:8080/kadai/kadai10.jsp?param1=x

 String  param1 = request.getParameter("param1");
 
int X= Integer.parseInt(param1);


out.println(X);%><br>

        <%
int check = 0;


while(check==0){
        
if(X%2==0){
    while(X % 2==0){
        X /= 2;//X= X/2
    out.println("2,");}
}
else if(X%3==0){
    while(X % 3==0){
        X /=3;
    out.println("3,");}
}
else if(X%5==0){
    while(X % 5==0){
        X /=5;
    out.println("5,");}
}
else if(X%7==0){
    while(X % 7==0){
        X /=7;
    out.println("7,");}
}
   else if(X == 1){
        check = 1;
    }else{
        check = 1;
                %><br><%
        out.print("その他　：　" + X);
    }
}   

   
        
     
        %>
    </body>
</html>
