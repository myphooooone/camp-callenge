<%-- 
    Document   : index
    Created on : 2016/09/07, 12:08:52
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
out.println("Hello world!!<br>");
out.println("Groove" + "-" + "gear<br>");
out.println("私は和田祐樹です<br>");


int num=20;
int NUM=10;

int tasi=num+NUM;
int hiki=num-NUM;
int kake=num*NUM;
int wari=num/NUM;
int amari=num%NUM;

out.println("num足すNUMは30です<br>");
out.println("num引くNUMは10です<br>");
out.println("numかけるNUMは200です<br>");
out.println("numわるNUMは2です<br>");
out.println("numあまりnumは10です<br>");



int param=5;
if (param==1){out.println("1です！");}
else if (param==2){out.println("プログラミングキャンプ！");}
else{out.println("その他です<br>");}


%>

