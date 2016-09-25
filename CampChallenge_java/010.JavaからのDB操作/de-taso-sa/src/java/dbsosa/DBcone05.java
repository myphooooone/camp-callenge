/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbsosa;

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
public class DBcone05 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * 課題5：nameに「茂」を含む情報を取得し、画面に取得した情報を表示してください

     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Connection db_con=null;
        PreparedStatement db_st=null;
        ResultSet db_data=null;
        
         PrintWriter out = response.getWriter();
        
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con=DriverManager.getConnection("jdbc:mysql://localhost:3306/challenge_db","wada","myphone");
            db_st= db_con.prepareStatement("select * from profiles where name like ?");
            db_st.setString(1, "%茂%");
           
            
            
            db_data=db_st.executeQuery();
            while(db_data.next()){
                out.println("名前は"+db_data.getString("name")+"<br>");
                out.print("誕生日は"+db_data.getString("birthday")+"<br>");
                out.println("電話番号は"+db_data.getString("tell")+"<br>");
            }
            
            
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
