package jums;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * insertresultと対応するサーブレット
 * フォームから入力された値をセッション経由で受け取り、データベースにinsertする
 * 直接アクセスした場合はerror.jspに振り分け
 * @author hayashi-s
 */
public class InsertResult extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //セッションスタート
        HttpSession session = request.getSession();
        
        try{
             request.setCharacterEncoding("UTF-8");//セッションに格納する文字コードをUTF-8に変更
            //直リンク防止
             String accesschk = request.getParameter("ac");
            if(accesschk ==null || (Integer)session.getAttribute("ac")!=Integer.parseInt(accesschk)){
             throw new Exception("不正なアクセスです");
            }
            
            //ユーザー情報に対応したJavaBeansオブジェクトに格納していく
            UserDataDTO userdata = new UserDataDTO();
            UserDataBeans udb = (UserDataBeans)session.getAttribute("udb");
            userdata.setName(udb.getName());
            Calendar birthday = Calendar.getInstance();
            birthday.set(Calendar.YEAR,(udb.getYear()));
            birthday.set(Calendar.MONTH+1,(udb.getMonth()));
            birthday.set(Calendar.DAY_OF_MONTH,(udb.getDay()));
            userdata.setBirthday(birthday.getTime());
            userdata.setType(Integer.parseInt((String)udb.getType()));
            userdata.setTell(udb.getTell());
            userdata.setComment(udb.getComment());
            
            
            
            //userdata.setName((String)session.getAttribute("name"));
            //Calendar birthday = Calendar.getInstance();
            
            
            
            //userdata.setBirthday(birthday.getTime());
            //userdata.setType(Integer.parseInt((String)session.getAttribute("type")));
            //userdata.setTell((String)session.getAttribute("tell"));
            //userdata.setComment((String)session.getAttribute("comment"));
            
            //DBへデータの挿入
            UserDataDAO .getInstance().insert(userdata);
            session.setAttribute("udb", udb);
            request.getRequestDispatcher("/insertresult.jsp").forward(request, response);
        }catch(Exception e){
            //データ挿入に失敗したらエラーページにエラー文を渡して表示
            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher("/error.jsp").forward(request, response);
      
        
        
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
