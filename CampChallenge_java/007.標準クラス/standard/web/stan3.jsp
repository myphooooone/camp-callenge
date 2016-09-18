<%-- 
    Document   : satan3
    Created on : 2016/09/18, 16:00:40
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
<%//３．2016年11月4日 10時0分0秒のタイムスタンプを作成し、
  //「年-月-日 時:分:秒」で表示してください。
Calendar cal = Calendar.getInstance();
cal.set(2016,10,4,10,0,0);
Date c = cal.getTime();
out.print("2016年11月4日10時0分0秒のスタンプ"+c.getTime()+"<br><br><br>");

int yy= cal.get(Calendar.YEAR);
int mm= cal.get(Calendar.MONTH)+1;
int dd= cal.get(Calendar.DAY_OF_MONTH);
int jj= cal.get(Calendar.HOUR);
int hh= cal.get(Calendar.MINUTE);
int bb= cal.get(Calendar.SECOND);

out.println(yy+"年"+ mm +"月"+ dd +"日"+ jj + "時"+ hh + "分" +dd + "秒です");

%>