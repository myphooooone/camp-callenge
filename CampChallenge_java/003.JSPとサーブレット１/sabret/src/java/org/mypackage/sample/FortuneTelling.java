/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Date;
import java.util.Random;
import javax.servlet.RequestDispatcher;
import org.mypackage.sample.ResultData;


/**
 *
 * @author wappen
 */
public class FortuneTelling extends HttpServlet {

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
        PrintWriter out = response.getWriter();
    String result="/WEB-INF/FortuneTellingResult.jsp";
    String luckList[]={"大吉","中吉","小吉","吉","凶","大凶"} ;
    
    Random rand=new Random();
    Integer index=rand.nextInt(luckList.length);
    
    //リクエストスコープへ結果を設定
    ResultData data = new  ResultData();
    data.setD(new Date());
    data.setLuck(luckList[index]);
    request.setAttribute("DATA",data);
    //rd= request.getRequestDispatcher(result);rd
    
    RequestDispatcher rd= request.getRequestDispatcher(result);
    rd.forward(request,response);
    
        try{
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet testServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet testServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            out.println("Hellow world!");
            out.println("今日のあなたの運勢は"+luckList[index]+"です!!");
        } finally {
                out.close();
            }
    }

}
