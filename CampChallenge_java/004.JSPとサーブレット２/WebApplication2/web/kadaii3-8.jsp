<%-- 
    Document   : kadaii3-8
    Created on : 2016/09/12, 20:04:32
    Author     : wappen
--%>
<%@page import="java.util.Map"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.HashMap" %>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
    </body>

<%
//課題8:先にInteger limit=2を定義しておき、課題7の処理のうち2人目(limitで定義し
//た値の人数)まででループ処理を抜けるようにする

%>
<%!
//     String getHumans(int prof){
     HashMap<String,String> getHumans(int prof){
         
  HashMap<String,String> human= new HashMap<String,String>();
  
//     String all="";
     
     if(prof==1){
  
         human.put("ID","7777");
         human.put("名前","田中太郎");
         human.put("誕生日","9/10");
         human.put("住所","東京都");
//         all=(human.get("名前")+human.get("誕生日")+human.get("住所"));
         
         
    }if(prof==2){

         human.put("ID","6666");
         human.put("名前","鈴木");
         human.put("誕生日","7/10");
         human.put("住所","神奈川県");
 //        all=(human.get("名前")+human.get("誕生日")+human.get("住所"));
         
    }if(prof==3){
        human.put("ID","5555");
        human.put("名前","佐藤");
        human.put("誕生日","8/10");
        human.put("住所",null);
 //       all=(human.get("名前")+human.get("誕生日")+human.get("住所"));
  }
        return human;
  }
%>
<% 
    
    
    Integer limit=2;//2人目で抜けます
    for(int i = 1; i <= 3; i++){
        HashMap<String, String> h = getHumans(i);
        for(Map.Entry<String, String> info : h.entrySet()) {
            if (info.getKey().equals("ID")) {
                continue;
            } else if (info.getValue() == null) {
                continue;
            }
            out.print(info.getKey()+":"+info.getValue()+"<br>");
        }
        out.print("<br>");
   
   
   if(i==limit)
       break;
   }
%>