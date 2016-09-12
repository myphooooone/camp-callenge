<%-- 
    Document   : kadai3-5
    Created on : 2016/09/12, 17:49:19
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
//引き数に1つのid(数値)をとり、3人分のプロフィール(項目は課題5参照)をあらかじめ
//メソッド内で定義しておく。引き数のid値により戻り値として返却するプロフィールを
//誰のものにするか選択する。それ以降などは課題5と同じ扱いに
    out.print(gethuman5().get(1));
    out.print(gethuman5().get(2));
    out.print(gethuman5().get(3));
%>


<%!
    ArrayList<String>gethuman(){
    ArrayList<String> hito=new ArrayList<String>();
    
    hito.add("7777");
    hito.add("田中太郎");
    hito.add("9/10");
    hito.add("宜しくお願いします");
    
    return hito;
    }
  
    ArrayList<String>getnuman1(){
    ArrayList<String> hito1=new ArrayList<String>();
    
    hito1.add("6666");
    hito1.add("山田太郎");
    hito1.add("8/10");
    hito1.add("宜しくお願いします");
  
    return hito1;

    }
     ArrayList<String>gethuman5(){
     ArrayList<String> hito2=new ArrayList<String>();
    
    hito2.add("5555");
    hito2.add("佐藤太郎");
    hito2.add("7/10");
    hito2.add("宜しくお願いします");
  
    return hito2;
}    
    String gethuman1(){
    return "5555";
}
//引数をヒューマン1にするとgetがエラーになってしまう。
%>
    
    
    </body>
</html>

