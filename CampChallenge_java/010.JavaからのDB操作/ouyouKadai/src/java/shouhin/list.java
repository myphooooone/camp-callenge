/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

商品一覧ページ
 */
package shouhin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 *
 * @author wappen
 */
public class list extends HttpServlet {

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
        
        Connection db_con=null;
        PreparedStatement db_st=null;
        ResultSet db_data=null;
        
        
        //商品一覧表
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con=DriverManager.getConnection("jdbc:mysql://localhost:3306/challenge_db","wada","myphone");
            db_st=db_con.prepareStatement("select * from shouhin");
            db_data=db_st.executeQuery();
            
            while(db_data.next()){
                out.print("アイテムは"+db_data.getString("item")+"です"+"<br>");
                out.print("値段は"+db_data.getInt("price")+"です"+"<br>");
                out.print("種類は"+db_data.getString("shurui")+"です"+"<br>");
            }
            
           }
            
             catch(SQLException e_sql){
            out.print("接続時にエラーが発生しました;"+e_sql.toString());
        }catch(Exception e){
            out.print("接続時にエラーが発生しました;"+e.toString());
        }finally{
            if(db_con != null){
                try{
                    db_con.close();
                }catch(Exception e_con){
                    System.out.println(e_con.getMessage());  
                
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
 