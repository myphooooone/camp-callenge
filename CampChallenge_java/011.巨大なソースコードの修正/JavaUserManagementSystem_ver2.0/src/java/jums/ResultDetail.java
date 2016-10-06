package jums;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hayashi-s
 */
public class ResultDetail extends HttpServlet {

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
        try{
            request.setCharacterEncoding("UTF-8");//リクエストパラメータの文字コードをUTF-8に変更

            //DTOオブジェクトにマッピング。DB専用のパラメータに変換
            UserDataDTO udd = (UserDataDTO)request.getAttribute("resultData");
            
            //UserDataDTOとUserDataBeansをここで使う為に宣言する
            UserDataDTO searchData = new UserDataDTO();
            UserDataBeans udb = new UserDataBeans();
            
                    
            //ID2番のデータが表示されていたので検索結果のデータを表示するように修正
            searchData.setUserID(Integer.parseInt(request.getParameter("id")));
            //UserDataDAOのserchByIDを使う
            UserDataDTO resultData = UserDataDAO .getInstance().searchByID(searchData);
            
            //sessionをセットする
            HttpSession session = request.getSession();
            udb.UserDataBeans(resultData);
            session.setAttribute("udb", udb);
            session.setAttribute("resultData", resultData);
            
            // resultdetail.jspへ飛ばす
            request.getRequestDispatcher("/resultdetail.jsp").forward(request, response);  
            
            
            
        }catch(Exception e){
            //何らかの理由で失敗したらエラーページにエラー文を渡して表示。想定は不正なアクセスとDBエラー
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
