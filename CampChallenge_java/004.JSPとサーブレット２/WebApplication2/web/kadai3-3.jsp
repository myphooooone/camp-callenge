<%--
    Document   : kadai3 3
    Created on : 2016/09/11, 21:01:08
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
<%
    
    out.print(kake(4,5,true));
%>
<%!
//引き数が3つのメソッドを定義する。1つ目は適当な数値を、2つ目はデフォルト値が5の
//数値を、最後はデフォルト値がfalse(boolean)のtypeを引き数として定義する。1つ目の
//引き数に2つ目の引き数を掛ける計算をするメソッドを作成し、typeがfalseの時はその値を
//表示、trueのときはさらに2乗して表示する。

 Integer kake(Integer num1, Integer num2, boolean type){
    int B=0;
    if(type==false){
        B= num1*num2;
        
    }else {
        B= num1*num2;
        B=B*B;
    }
    return B;
    }
%>
    </body>
</html>