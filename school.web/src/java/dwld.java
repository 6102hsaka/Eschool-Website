/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


/**
 *
 * @author TT
 */
@WebServlet(urlPatterns = {"/dwld"})
public class dwld extends HttpServlet {




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
        PrintWriter out = response.getWriter();
        HttpSession ses = request.getSession();
        
            String nmr = request.getParameter("nm1");
            String name=null;
            if(nmr.equals("Admission List"))
                name = "Admission.pdf";
            else if(nmr.equals("Assignment"))
                name="assignment.pdf";
            else if(nmr.equals("Routine"))
                name="routine.jpg";
            else if(nmr.equals("Holiday List"))
                name="holiday.pdf";
            else if(nmr.equals("Result"))
                name="result.pdf";
            else if(nmr.equals("Exam Schedule"))
                name="exam.pdf";
            else if(nmr.equals("Complains"))
                name = "complain.pdf";
            else if(nmr.equals("Attendance List"))
                name="attendance.pdf";
            String path = "C:\\Users\\TT\\Documents\\NetBeansProjects\\school.web\\notice\\";
            response.setContentType("APPLICATION/OCTET-STREAM");
            response.setHeader("Content-Disposition", "attachment;filename=\""+name+"\"");
            FileInputStream fi = new FileInputStream(path+name);
            int i;
            while((i=fi.read()) != -1)
            {
                out.write(i);
            } 
            fi.close();
            out.close();
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
