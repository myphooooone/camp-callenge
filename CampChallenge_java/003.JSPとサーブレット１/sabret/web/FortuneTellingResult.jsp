<%-- 
    Document   : FortuneTellingResult
    Created on : 2016/09/10, 22:38:35
    Author     : wappen
--%>
<%@page import="org.mypackage.sample.ResultData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            
            ResultData data= (ResultData)request.getAttribute("DATA");
            %>
            
            
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            if(data !=null);{
            out.print("<h1>あなたの"+data.getd()+"の運勢は、"+data.getluck()+"です！</h1>");
        }
      
        %>
    </body>
</html>