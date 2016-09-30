<%@page import="jums.UserDataBeans"%>
<%@page import="jums.JumsHelper"%>
<%@page import="javax.servlet.http.HttpSession" %>
<%
    HttpSession hs = request.getSession();//トップへのリンク先を貼りつけました
    UserDataBeans udb =  (UserDataBeans)hs.getAttribute("udb");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録確認画面</title>
    </head>
    <body>     <!--未入力かどうかのチェック-->
             <%if(udb!=null){
             %>  <!--sessionからudbに変更-->
        <h1>登録確認</h1>
        名前:<%= udb.getName()%><br>
        生年月日:<%= udb.getYear()+"年"+udb.getMonth()+"月"+udb.getDay()+"日"%><br>
        種別:<%= udb.getType()%><br>
        電話番号:<%= udb.getTell()%><br>
        自己紹介:<%= udb.getComment()%><br>
        上記の内容で登録します。よろしいですか？
        <form action = "insertresult" method="POST">
            <!--直リンク防止-->
           <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">
           <input type="submit" name="yes" value="はい">
        </form> 
        
    <% }else{  //もし未入力だった場合の処理
            if(udb.getName().equals("")){
               out.print("名前が未入力です"+"<br>");
            }
            if(udb.getYear()==0){
               out.print("年が未入力です"+"<br>");
            }
            if(udb.getMonth()==0){
               out.print("月が未入力です"+"<br>");
            }
            if(udb.getDay()==0){
              out.print("日が未入力です"+"<br>");
            }
            if(udb.getType()==null){
              out.print("種別が未入力です"+"<br>");
            }
            if(udb.getTell().equals("")){
              out.print("電話番号が未入力です"+"<br>");
            }
            if(udb.getComment().equals("")){
              out.print("コメントが未入力です"+"<br>");
            }
         }
      %>
        <form action="insert" method="POST">
            <input type="submit" name="no" value="登録画面に戻る">
        </form>
           <%=JumsHelper.getInstance().home()%>
    </body>
</html>
