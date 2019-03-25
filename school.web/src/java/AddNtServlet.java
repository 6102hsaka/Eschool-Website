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
@WebServlet(urlPatterns = {"/AddNtServlet"})
public class AddNtServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        String sub = request.getParameter("sub");
        RequestDispatcher rd=null;
        HttpSession ses = request.getSession();
        try
            {
                Connection cn= null;PreparedStatement pst=null;int res=0;
                Class.forName("com.mysql.jdbc.Driver");
                cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/eschool", "root", null);
                String str="Insert into notice values(?)";
                pst=cn.prepareStatement(str);
                pst.setString(1, sub);
                res = pst.executeUpdate();
                if(res==1)
                {
                    ses.setAttribute("msg", "Record Added");
                    rd =request.getRequestDispatcher("/alterNotice.jsp");
                    rd.forward(request, response);
                }
                else
                {
                    ses.setAttribute("msg", "Error Occured!!!!");
                    rd =request.getRequestDispatcher("/alterNotice.jsp");
                    rd.forward(request, response);   
                }
            }
        catch(ClassNotFoundException | SQLException er)
            {
                out.println(er.getMessage());
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
