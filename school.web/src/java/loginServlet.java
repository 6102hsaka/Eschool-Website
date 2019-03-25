/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;

/**
 *
 * @author TT
 */
@WebServlet(name = "loginServlet_1", urlPatterns = {"/loginServlet_1"})
public class loginServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        response.setHeader("Cache-control", "no-cache,no-store,must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Expires", "0");
        String user=null,pass=null,cp=null;
        user = request.getParameter("nm");
        pass = request.getParameter("pass");
        cp = request.getParameter("cpt");
        
        RequestDispatcher rd = null;
        HttpSession ses = request.getSession();
        int str=(int)ses.getAttribute("check");int res=0;
        if(str==Integer.parseInt(cp))
        {
            try
            {
                Connection cn= null;PreparedStatement pst=null;ResultSet rs=null;
                Class.forName("com.mysql.jdbc.Driver");
                cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/eschool", "root", null);
                String str1="Select count(*) from login where username = ? and password = ?";
                pst=cn.prepareStatement(str1);
                pst.setString(1 , user);
                pst.setString(2, pass);
                rs=pst.executeQuery();
                while(rs.next())
                {
                    res=rs.getInt(1);
                }  
                if(res==0)
                {
                    ses.setAttribute("is", "Invalid Username or Password!!!!");
                    rd =request.getRequestDispatcher("/index.jsp");
                    rd.forward(request, response);
                }
                else
                {
                    ses.setAttribute("user", user);
                    rd =request.getRequestDispatcher("/home.jsp");
                    rd.forward(request, response);
                }
            }
            catch(ClassNotFoundException | SQLException er)
            {
                out.println(er.getMessage());
            }
        }
        else
        {
            ses.setAttribute("is", "Invalid captcha!!!!");
            rd =request.getRequestDispatcher("/index.jsp");
            rd.forward(request, response);   
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
