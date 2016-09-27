<%-- 
   商品名追加ページ
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
        <form action="./insert" method="post">
        アイテム名:<input type="text" name="item">
             値段:<input type="text" name="price">
             種類：<input type="text" name="shurui">
        <input type="submit" value="送信">
        </form>
    </body>
</html>
