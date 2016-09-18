<%-- 
    Document   : stan5
    Created on : 2016/09/18, 16:57:44
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
//５．自分の氏名について、バイト数と文字数を取得して、表示してください。

String name = "和田祐樹";
//文字数
out.print("文字数は"+name.length()+"です"+"<br>");
//バイト数
out.print("バイト数は"+name.getBytes().length+"です");



%>
