<%-- 
    Document   : test2
    Created on : 2016/09/10, 16:49:57
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
    String name=getMyName();
    String birth=getMybirth();
    String prof=getMyprofile();
    
    
    for(int i=0; i<10 ;i++){ 
    out.print(getMyName()+"<br>");
    out.print(getMybirth()+"<br>");
    out.print(getMyprofile()+"<br>");
   
    }
%>
<%!
   
   String getMyName(){
    return"和田祐樹"; 
   }
   String getMybirth(){
    return"7月9日";
    }
   String getMyprofile(){
    return"神奈川県相模原出身です";
    }
   
%>
    
 </body>
</html>

