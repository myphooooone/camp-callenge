<%-- 
    Document   : kadai3 5
    Created on : 2016/09/11, 22:22:06
    Author     : wappen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<%
//戻り値としてある人物のid(数値),名前,生年月日、住所を返却するメソッドを作成し、
//受け取った後はid以外の値を表示する


out.print(getName().get(1));
out.print(getName().get(2));
out.print(getName().get(3));


    

%>
<%!
    ArrayList<String>getName(){
    ArrayList<String> hito=new ArrayList<String>();
    
    hito.add("7777");
    hito.add("和田祐樹");
    hito.add("1987　/7/9");
    hito.add("神奈川県相模原市");
            
    return hito;
}

%>
</body>
</html>