<%-- 
    Document   : kadai 3
    Created on : 2016/09/11, 18:38:40
    Author     : wappen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.IOException" %>
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
//自分のプロフィール(名前、生年月日、自己紹介)を3行に分けて表示するユーザー定義
//メソッドを作り、メソッドを10回呼び出して下さい
  
//課題1で定義したメソッドに追記する形として、戻り値　true(boolean)　を返却するように
//修正し、メソッドの呼び出し側でtrueを受け取れたら「この処理は正しく実行できました」、
//そうでないなら「正しく実行できませんでした」と表示する 
%>

<%
      
    String name="和田祐樹";
    String birth="7月9日";
    String prof="神奈川県相模原市出身です";
    
//   dispText(out,name,birth,prof);
   
 
       if (dispText(out,name,birth,prof)==true){
           out.print("この処理は正しく実行出来ました");
       }else {
           out.print("正しく実行されませんでした");
       }
       
%>
<%!
   boolean dispText(JspWriter jw,String name,String birth,String prof){
    try {
   jw.println(name+"<br>"+birth+"<br>"+prof);
    } catch(IOException e) {
        System.out.println(e.getMessage());
    }
          return true;   
}

%>   
