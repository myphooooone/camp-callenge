/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
商品追加ページ


 */
package shouhin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author wappen
 */
public class insert extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
         request.setCharacterEncoding("UTF-8");
         
       PrintWriter out = response.getWriter();
       
       //insert.jspから受け取ります
       
       String item = request.getParameter("item");
       String price = request.getParameter("price");        
       String shurui = null;
       shurui =request.getParameter("shurui");
       
       int price1 =  Integer.parseInt(price);
       
       Connection db_con=null;
       PreparedStatement db_st=null;
       ResultSet db_data=null;
        
       
       if(item.isEmpty()||shurui.isEmpty()){
               request.setAttribute("back", "記入し直してください");
               request.getRequestDispatcher("/insert.jsp").forward(request, response);
           }
        //商品ファイルに追加の処理
        try  {
          Class.forName("com.mysql.jdbc.Driver").newInstance();
          db_con=DriverManager.getConnection("jdbc:mysql://localhost:3306/challenge_db","wada","myphone");
          db_st=db_con.prepareStatement("insert into shouhin values (?,?,?)");
          db_st.setString(1,item);
          db_st.setInt(2, price1);
          db_st.setString(3, shurui);
          db_st.executeUpdate();
          
         
           
        } catch (Exception e) {

        } finally {
            if (db_con != null) {
                try {
                    db_con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
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
