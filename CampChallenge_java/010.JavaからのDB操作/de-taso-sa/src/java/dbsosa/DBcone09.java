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
public class DBcone09 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * 課題9:フォームからデータを挿入できる処理を構築してください。
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        
        Connection db_con=null;
        PreparedStatement db_st=null;
        ResultSet db_data=null;
      
        try  {
            String ID=request.getParameter("ID");
            String name=request.getParameter("name");
            String tell=request.getParameter("tell");
            String age=request.getParameter("age");
            String birth=request.getParameter("birth");
            
            int ID1  = Integer.parseInt(ID);
            int age1 = Integer.parseInt(age);
          
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con=DriverManager.getConnection("jdbc:mysql://localhost:3306/challenge_db","wada","myphone");
            db_st=db_con.prepareStatement("insert into profiles  values ( ?,?,?,?,?)");
            db_st.setInt(1, ID1);
            db_st.setString(2,name);
            db_st.setString(3,tell);
            db_st.setInt(4, age1);
            db_st.setString(5, birth);
            
            
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
