<%-- 
    Document   : stan4
    Created on : 2016/09/18, 16:16:04
    Author     : wappen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
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
//４．2015年1月1日 0時0分0秒と2015年12月31日 23時59分59秒の差（ミリ秒）
//を表示してください。
Calendar cal = Calendar.getInstance();
cal.set(2015,0,1,0,0,0);
Date c = cal.getTime();
out.print("2015年1月1日0時0分0秒のスタンプ"+c.getTime()+"<br><br><br>");


long time1 = c.getTime();
%>
<%
Calendar pal = Calendar.getInstance();
cal.set(2015,11,31,23,59,59);
Date o = pal.getTime();
out.print("2015年12月31日23時59分0秒のスタンプ"+o.getTime()+"<br><br><br>");

long  time2 = o.getTime();

%>
<%
out.print(time2-time1);

%>