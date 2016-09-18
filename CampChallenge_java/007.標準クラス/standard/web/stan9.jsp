<%-- 
    Document   : stan9
    Created on : 2016/09/18, 18:55:13
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
<%   
//９．ファイルから自己紹介を読み出し、表示してください。
        File wada = new File("prof.txt");
        
        //読み込みモードでオブジェクト生成
        FileReader fr = new FileReader(wada);
        
        //読み込み用にバッファリング
        BufferedReader br = new BufferedReader(fr);
        
        //読み込む
        String str;
        while((str = br.readLine()) != null){
            out.print(str);
        }
        //ファイルクローズ
        br.close();
        
        
%>