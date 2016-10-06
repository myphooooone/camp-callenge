<%@page import="jums.UserDataBeans"%>
<%@page import="jums.UserDataDTO"%>
<%@page import="jums.JumsHelper" %>
<%
    JumsHelper jh = JumsHelper.getInstance();
    UserDataBeans udb = (UserDataBeans) session.getAttribute("udb");
    UserDataDTO udd = (UserDataDTO) session.getAttribute("resultData");

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS変更画面</title>
    </head>
    <body>
        <!--uddからデータを挿入-->

        <form action="UpdateResult" method="POST">
       
            名前:
            <input type="text" name="name" value="<%=udd.getName()%>">
            <br><br>

            生年月日:　
            <select name="year">
                <option value="">----</option>
                <% for (int i = 1950; i <= 2010; i++) {%>
                <option value="<%=i%>" <% if (udb.getYear() == i) {
                        out.print("selected = \"selected\"");
                    }%>><%=i%></option>
                <% } %>
            </select>年
            <select name="month">
                <option value="">--</option>
                <% for (int i = 1; i <= 12; i++) {%>
                <option value="<%=i%>"<% if (udb.getMonth() == i) {
                        out.print("selected = \"selected\"");
                    }%>><%=i%></option>
                <% } %>
            </select>月
            <select name="day">
                <option value="">--</option>
                <% for (int i = 1; i <= 31; i++) {%>
                <option value="<%=i%>"<% if (udb.getDay() == i) {
                        out.print("selected = \"selected\"");
                    }%>><%=i%></option>
                <% } %>
            </select>日
            <br><br>

            種別:
            <br>
            <% for (int i = 1; i <= 3; i++) {%>
            <input type="radio" name="type" value="<%=i%>"<%if (udb.getType() == i) {
                    out.print("checked = \"checked\"");
                }%>><%=jh.exTypenum(i)%><br>
            <%}%>
            <br>

            電話番号:
            <input type="text" name="tell" value="<%=udd.getTell()%>">
            <br><br>

            自己紹介文
            <br>
            <textarea name="comment" rows=10 cols=50 style="resize:none" wrap="hard"><%=udd.getComment()%></textarea><br><br>
            <input type="submit" name="btnSubmit" value="確認画面へ">
            
            <!--ブラウザ上で見えないようにIDを飛ばす-->
            <input type="hidden" name="id"  value="<%= udd.getUserID()%>">
        </form>
            

        <br>
        <%=jh.home()%>
    </body>
</html>

