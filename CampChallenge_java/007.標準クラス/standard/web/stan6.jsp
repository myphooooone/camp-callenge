<%-- 
    Document   : stan6
    Created on : 2016/09/18, 17:09:15
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
//６．自分のメールアドレスの「@」以降の文字を取得して、表示してください。

String adress = "myphooooone@i.softbank.jp";
   out.print(adress.indexOf("@"));
%>