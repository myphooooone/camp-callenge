<%-- 
    Document   : stan2
    Created on : 2016/09/18, 15:37:51
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
//２．現在の日時を「年-月-日 時:分:秒」で表示してください。
Date c = new Date();


Calendar cal = Calendar.getInstance();
cal.setTime(c);


int yy= cal.get(Calendar.YEAR);
int mm= cal.get(Calendar.MONTH)+1;
int dd= cal.get(Calendar.DAY_OF_MONTH);
int jj= cal.get(Calendar.HOUR);
int hh= cal.get(Calendar.MINUTE);
int bb= cal.get(Calendar.SECOND);

out.println("現在の日時は"+yy+"年"+ mm +"月"+ dd +"日"+ jj + "時"+ hh + "分" +dd + "秒です");




%>