/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbsosa;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 *
 * @author wappen
 */
public class DBcone11 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * 課題11:profileIDで指定したレコードの、profileID以外の要素をすべて上書きできるフォームを作成してください

     */
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        Connection db_con=null;
        PreparedStatement db_st=null;
        ResultSet db_data=null;
        
        
        try  {
            String ID = request.getParameter("ID");
            String name1 = request.getParameter("name");
            String tell1 = request.getParameter("tell");
            String age = request.getParameter("age");
            String birth1 = request.getParameter("birth");
       
            int ID1  = Integer.parseInt(ID);
            int age1 = Integer.parseInt(age);
            
            
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con=DriverManager.getConnection("jdbc:mysql://localhost:3306/challenge_db","wada","myphone");
            db_st=db_con.prepareStatement("update profiles set where name=?,tell=?,age=?,birth=?");
            
            
            db_st.setString(1,name1);
            db_st.setString(2,tell1);
            db_st.setString(3,age); 
            db_st.setString(4,birth1); 
              
              
            db_st.executeUpdate();
            
            
            
            
            
            
            
            db_data.close();
            db_st.close();
            db_con.close();
            
            
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
