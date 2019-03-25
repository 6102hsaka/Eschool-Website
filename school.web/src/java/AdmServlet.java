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
@WebServlet(urlPatterns = {"/AdmServlet"})
public class AdmServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        String sname=request.getParameter("nm");
        String sex = ("M".equals(request.getParameter("sex"))?"Male":"Female");
        String dob = request.getParameter("dob");
        int cls = Integer.parseInt(request.getParameter("cls"));
        String preAd = request.getParameter("preAdd");
        String perAd = request.getParameter("permAdd");
        String fname=request.getParameter("fname"); 
        String focc = request.getParameter("focc");
        String mname = request.getParameter("mname");
        String mocc = request.getParameter("mocc");
        String mn= request.getParameter("no");
        String amn = request.getParameter("ano");
        String email = request.getParameter("email");
        String pass1 = request.getParameter("pass1");
        String pass2 = request.getParameter("pass2");
        HttpSession ses=request.getSession();
        RequestDispatcher rd = null;
        if(pass1.equals(pass2)!=true)
        {
            ses.setAttribute("check", "please confirm your password");
            rd= request.getRequestDispatcher("/Admission.jsp");
            rd.forward(request, response);
        }
        else
        {
            try
            {
                Connection cn= null;PreparedStatement pst=null;int res=0;
                Class.forName("com.mysql.jdbc.Driver");
                cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/eschool", "root", null);
                String str="Insert into admission values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                pst=cn.prepareStatement(str);
                pst.setString(1, (sname+dob+sex));
                pst.setString(2, sname);
                pst.setString(3, sex);
                pst.setString(4, dob);
                pst.setInt(5, cls);
                pst.setString(6, preAd);pst.setString(7, perAd);
                pst.setString(8, fname);pst.setString(9, focc);
                pst.setString(10, mname);pst.setString(11, mocc);
                pst.setString(12, mn);pst.setString(13, amn);
                pst.setString(14, email);pst.setString(15, pass1);
                res = pst.executeUpdate();
                if(res==1)
                {
                    rd =request.getRequestDispatcher("/continue.jsp");
                    rd.forward(request, response);
                }
                else
                {
                    ses.setAttribute("err1", "Error Occured!!!!");
                    rd =request.getRequestDispatcher("/Admission.jsp");
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
