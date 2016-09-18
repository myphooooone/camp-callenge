<%-- 
    Document   : stan8
    Created on : 2016/09/18, 17:30:21
    Author     : wappen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"
        import="java.util.*,java.text.*,java.io.*" %>
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
<%//８．ファイルに自己紹介を書き出し、保存してください。
        
        //ファイルの場所
        File prof = new File("prof.txt");
      
        //ファイルを開く
        FileWriter fw = new FileWriter(prof);
        //まとめて書き込む
        BufferedWriter bw = new BufferedWriter(fw);
        
        bw.write("和田祐樹です<br>");
        bw.write("神奈川県相模原市出身です<br>");
       
        
        //ファイルを閉じる
        bw.close();
        
%>