<%-- 
    Document   : kadai 3
    Created on : 2016/09/11, 18:38:40
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
<%!
    //引数として数値を受け取り、その値が奇数か偶数か判別＆表示する処理をメソッドとして制作し、
    //適当な数値に対して奇数・偶数の判別を行ってください

    String kisugusu(int num){
    if(num%2==0){
        return"偶数です";
    }  
        else{
        return"奇数です";
    }
    }
    
%>
<%
   int num=15;
    String hanbetu=kisugusu(num);
    out.print(hanbetu);
    
    
    
    
 %>   