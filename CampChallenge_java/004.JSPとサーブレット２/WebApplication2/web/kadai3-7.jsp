<%-- 
    Document   : kadai3-7
    Created on : 2016/09/12, 19:34:50
    Author     : wappen
--%>

<%@page import="java.util.Map"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.HashMap" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
    </body>
</html>
<%
//課題6の3人分のプロフィールのうち1人だけ住所が値nullの状態で定義し、
//ループ処理で全員分のプロフィールをid以外表示する処理を実行する。
//この際、歯抜けになっているデータはcontinueで飛ばす
%>
<%!

     HashMap<String,String> getHumans(int prof){
         
  HashMap<String,String> human= new HashMap<String,String>();
 
     if(prof==1){
         
         human.put("ID","7777");
         human.put("名前","田中太郎");
         human.put("誕生日","9/10");
         human.put("住所","東京都");
         
    }if(prof==2){

         human.put("ID","6666");
         human.put("名前","鈴木");
         human.put("誕生日","7/10");
         human.put("住所","神奈川県");
       
    }if(prof==3){
        human.put("ID","5555");
        human.put("名前","佐藤");
        human.put("誕生日","8/10");
        human.put("住所",null);
  }
        return human;
  }
%>
<% 
    Integer limit=2;
    for(int i = 1; i <= 3; i++){
        HashMap<String, String> h = getHumans(i);
        for(Map.Entry<String, String> info : h.entrySet()) {
            if (info.getKey().equals("ID")) {
                continue;
    }
        else if (info.getValue() == null) {
                continue;
    }
            out.print(info.getKey()+":"+info.getValue()+"<br>");
    }
        out.print("<br>");
    }
   
   
%>       