/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


/**
 *
 * @author TT
 */
@WebServlet(urlPatterns = {"/AddServlet"})
public class AddServlet extends HttpServlet {

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
        String user=null,pass1=null,pass2=null,degs=null;int x=0;
        user = request.getParameter("nm");
        pass1 = request.getParameter("pass1");
        pass2 = request.getParameter("pass2");
        degs=request.getParameter("deg");
        HttpSession ses = request.getSession();
        if(pass1.equals(pass2) != true && pass1 != null)
        {
            ses.setAttribute("is", "password not matched !!!!");
            RequestDispatcher rd =request.getRequestDispatcher("/Add.jsp");
            rd.forward(request, response);
        }
        else
        {
            try
            {
                Connection cn= null;PreparedStatement pst=null;int res=0;
                Class.forName("com.mysql.jdbc.Driver");
                cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/eschool", "root", null);
                String str="Insert into login values(?,?,?,?)";
                pst=cn.prepareStatement(str);
                pst.setString(1, user);
                pst.setString(2, pass1);
                pst.setString(3, degs);
                pst.setInt(4, x);
                res = pst.executeUpdate();
                if(res==1)
                {
                    ses.setAttribute("user", user);
                    RequestDispatcher rd =request.getRequestDispatcher("/home.jsp");
                    rd.forward(request, response);
                }
                else
                {
                    ses.setAttribute("is", "Error Occured!!!!");
                    RequestDispatcher rd =request.getRequestDispatcher("/index.jsp");
                    rd.forward(request, response);   
                }
                    
            }
            catch(ClassNotFoundException | SQLException er)
            {
                out.println(er.getMessage());
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
