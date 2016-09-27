<%-- 
   
ログインページ


--%>
<%
    String miss =null;
    miss = (String) request.getAttribute("back");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%if(miss != null){out.print(miss);}%>
        <form action ="menu" method="post">
            名前:<input type="text" name="name">
            <input type="submit" value="送信">
        </form>
    </body>
</html>
