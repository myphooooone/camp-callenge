<%@page import="jums.JumsHelper"
        import="jums.UserDataDTO" %>
<%
    JumsHelper jh = JumsHelper.getInstance();
    //uddにresultDataを挿入
    UserDataDTO udd = (UserDataDTO)session.getAttribute("resultData");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <h1>削除確認</h1>
    以下の内容を削除します。よろしいですか？
    <!--uddからデート受け取り画面に表示させる-->
    名前:<%= udd.getName()%><br>
    生年月日:<%= udd.getBirthday()%><br>
    種別:<%= udd.getType()%><br>
    電話番号:<%= udd.getTell()%><br>
    自己紹介:<%= udd.getComment()%><br>
    登録日時:<%= udd.getNewDate()%><br>
    
    <form action="DeleteResult?id=<%= udd.getUserID()%>" method="POST">
      <input type="submit" name="YES" value="はい" style="width:100px">
    </form><br>
    <form action="resultdetail.jsp" method="POST">
      <input type="submit" name="NO" value="詳細画面に戻る" style="width:100px">
    </form>
    </body>
</html>
