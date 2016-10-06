<%@page import="java.util.ArrayList"%>
<%@page import="jums.JumsHelper"
        import="jums.UserDataDTO" %>
<%
    JumsHelper jh = JumsHelper.getInstance();
    
    //ArrayListにresultdataを入れる
    ArrayList<UserDataDTO> ary = (ArrayList<UserDataDTO>) session.getAttribute("resultData");


%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS検索結果画面</title>
    </head>
    <body>
        <h1>検索結果</h1>
        <table border=1>
            <tr>
                <th>名前</th>
                <th>生年</th>
                <th>種別</th>
                <th>登録日時</th>
            </tr>
<tr>            <!--aryのsize分検索結果を表示-->
            <%  for (int i = 0; i < ary.size(); i++) {
              
            %>
                <!--変数aryからユーザーのデータを取り出してくる-->
                <td><a href="ResultDetail?id=<%=((UserDataDTO) ary.get(i)).getUserID()%>"><%=((UserDataDTO) ary.get(i)).getName()%></a></td>
                <td><%= ((UserDataDTO) ary.get(i)).getBirthday()%></td>  
                <td><%= ((UserDataDTO) ary.get(i)).getType()%></td>
                <td><%= ((UserDataDTO) ary.get(i)).getNewDate()%></td>
            </tr>              
            <%}%>

        </table>
    </body>
    <%=jh.home()%>
</html>
