package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>About Us</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"layoutCss.css\">\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            #abt { position:fixed;top:200px;left:30px;right:30px;font-family: cursive;\n");
      out.write("                   font-size: 25px;}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>  \n");
      out.write("        <div id=\"head\">\n");
      out.write("            <h1>XYZ School</h1>   \n");
      out.write("            <h6>2/1 Vidyasagar Road,Howrah-1</h6>\n");
      out.write("            <hx>\n");
      out.write("            ");

            String str = (String)session.getAttribute("user");
            out.println("Hello "+ str);
            
      out.write("<br/>\n");
      out.write("            <a href=logoutServlet>logout</a>\n");
      out.write("            </hx>\n");
      out.write("            <hr>\n");
      out.write("            <hm>\n");
      out.write("                <a href=\"home.jsp\">Return Home</a>\n");
      out.write("    </hm>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"tb\">\n");
      out.write("        <table border=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"padding-right: 60px;padding-left: 25px;\">\n");
      out.write("                    <a href=\"Admission.jsp\">Admission</a>\n");
      out.write("                </td>\n");
      out.write("                <td style=\"padding-right: 60px;\">\n");
      out.write("                    <a href=\"about.jsp\">About us</a>\n");
      out.write("                </td>\n");
      out.write("                <td style=\"padding-right: 60px;\">\n");
      out.write("                    <a href=\"contact.jsp\">Contacts us</a>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <a href=\"feedback.jsp\">Feedback</a>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        </div>\n");
      out.write("    <div id=\"abt\">\n");
      out.write("        \n");
      out.write("        <b style=\"color: tomato;\">Message from Principle</b><br/>\n");
      out.write("        <img src=\"img_avatar.png\" style=\"height:100px;width:70px;\"><br/>\n");
      out.write("        Welcome to our School.We continue to rank among best School in the Nation.Our primary goal is \n");
      out.write("        to become one of the most prominent and excellent school in the world.We would be delighted\n");
      out.write("        to be involved in the education of your child and to foster in him/her the value based education.\n");
      out.write("        <br/><br/>\n");
      out.write("        <b style=\"color: tomato;\">Why Choose Us?</b> <br/>\n");
      out.write("        The School opens a world of possibilities for student from Preschool to grade 12 by providing\n");
      out.write("        the rigorous bilingual Education,inclusive cultural Experience and global mindset required to learn\n");
      out.write("        and lead today and in the future.\n");
      out.write("        \n");
      out.write("     </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
