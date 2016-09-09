<%-- 
    Document   : su-pa-
    Created on : 2016/09/07, 15:10:55
    Author     : wappen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>

<%
//クエリストリング
//http://www.XXX.jp:8080/aaaa/sample.php?param1=2&param2=3&param3=4

    
 String param1 = request.getParameter("param1");   
 String param2 = request.getParameter("param2");   
 String param3 = request.getParameter("param3");
 
 if(param1 ==null){
     param1="2";
 }
 if(param2 ==null){
     param2="10";
 }
 if( param3 == null){
     param3="1000";
 }

  //種類
  int type= Integer.parseInt(param1);
  //個数
  int num= Integer.parseInt(param2);
  //総額
  int money= Integer.parseInt(param3);

  
    if(type==1){
        out.print("雑貨です<br>");
    }
    else if(type==2){
        out.print("生鮮食品です<br>");
    }
    else if(type==3){
        out.print("その他です<br>");
    }
    
    int kake = money / num;
    out.println("総額" + money +"円です<br>");
    out.println("一つ当たり" + kake + "円です<br>");
  

  int total = num* money;
  
   if( total > 3000 ){
       int point = total *= 0.04;
       out.println("3000円以上購入で" + point +"のポイントが付きます");     
   }
   else if( total > 5000 ){
       int point= total *= 0.05;
       out.println("5000円以上購入で"+ point +"のポイントが付きます");
   }

%>

    </body>
</html>