package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 Connection cn = null; PreparedStatement pst=null,pst2=null;ResultSet rs=null,rs1=null;int res=0; String str;
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"layoutCss.css\">\n");
      out.write("        <style>\n");
      out.write("            .mySlides {display:none;width:750px;height:400px;position: absolute;left: 0px;top:188px;\n");
      out.write("            border: 5px solid tomato;}\n");
      out.write("            #nb { position: absolute;top: 160px;right:15px;font-size: 35px;background-color: orangered;width: 550px;}\n");
      out.write("            #nbin { position: absolute;top :auto;right: auto;height: 265px;background-color: linen;width: 550px;font-size: 20px;}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"head\">\n");
      out.write("                    ");
      out.write("\n");
      out.write("        <h1>XYZ School</h1>   <h6>2/1 Vidyasagar Road,Howrah-1</h6>\n");
      out.write("        <hx>");

            str = (String)session.getAttribute("user");
            out.println("Hello "+ str);
        
      out.write("<br/>\n");
      out.write("        <a href=logoutServlet>logout</a>\n");
      out.write("        </hx>\n");
      out.write("        <hr>\n");
      out.write("        <hm>\n");
      out.write("        ");

           try
           {
                Class.forName("com.mysql.jdbc.Driver");
                cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/eschool", "root", null);
                String str2="Select count(*) from login where username = ? and id='Teacher' and verification=111" ;
                pst=cn.prepareStatement(str2);
                pst.setString(1 , str);
                rs=pst.executeQuery();
                while(rs.next())
                {
                    res=rs.getInt(1);
                }  
                if(res==0)
                {
                    
                }
                else
                {
                    out.println("<a href=admin.jsp>Admin Control</a>");
                }
           }
           catch(ClassNotFoundException | SQLException er)
           {
               out.println(er.getMessage());
           }
        
      out.write("\n");
      out.write("        </hm>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"nb\">\n");
      out.write("        <center>Latest Announcement</center>\n");
      out.write("        <div id=\"nbin\">    \n");
      out.write("        <marquee behavior=\"scroll\" direction=\"up\" scrollamount=\"4\">\n");
      out.write("            ");

                 try
                 {
                     String str1="select * from notice";
                     pst2=cn.prepareStatement(str1);
                     rs1=pst2.executeQuery();
                     out.print("<ul type=round>");
                     while(rs1.next())
                     {
                         out.println(rs1.getString(1)+"<br/>");
                     }
                     out.print("</ul>");
                 }
                 catch(SQLException e)
                 {
                     out.println(e.getMessage());
                 }
            
      out.write("\n");
      out.write("        </marquee>\n");
      out.write("         </div>\n");
      out.write("    </div>\n");
      out.write("        <!-- Image Slider-->\n");
      out.write("  <div id=\"slide\" >\n");
      out.write("  <img class=\"mySlides\" src=\"front.jpg\" >\n");
      out.write("  <img class=\"mySlides\" src=\"back.jpg\">\n");
      out.write("  <img class=\"mySlides\" src=\"chess.png\">\n");
      out.write("  <img class=\"mySlides\" src=\"basketball.jpg\">\n");
      out.write("  <img class=\"mySlides\" src=\"primary.jpg\"><img class=\"mySlides\" src=\"secondary.jpg\">\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("var myIndex = 0;\n");
      out.write("carousel();\n");
      out.write("\n");
      out.write("function carousel() {\n");
      out.write("    var i;\n");
      out.write("    var x = document.getElementsByClassName(\"mySlides\");\n");
      out.write("    for (i = 0; i < x.length; i++) {\n");
      out.write("       x[i].style.display = \"none\";  \n");
      out.write("    }\n");
      out.write("    myIndex++;\n");
      out.write("    if (myIndex > x.length) {myIndex = 1}    \n");
      out.write("    x[myIndex-1].style.display = \"block\";  \n");
      out.write("    setTimeout(carousel, 1500); // Change image every 2 seconds\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("    <div id=\"tb\">\n");
      out.write("        <table border=\"0\" style=\"background-color: #ffff66;width:760px;\">\n");
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
      out.write("    </div>\n");
      out.write("<div id=\"ntc\">\n");
      out.write("        <form action=\"dwld\" method=\"get\">\n");
      out.write("        <center>Download Links</center>\n");
      out.write("            <input class=\"admission\" type = submit name = nm1 value = \"Admission List\" />\n");
      out.write("            <input class=\"attendance\" type = submit name = nm1 value =\"Attendance List\"  />\n");
      out.write("            <input class=\"assignment\" type = submit name = nm1 value =\"Assignment\"  />\n");
      out.write("            <input class=\"exam\" type = submit name = nm1 value =\"Exam Schedule\"  />\n");
      out.write("            <input class=\"result\" type = submit name = nm1 value =\"Result\"  />\n");
      out.write("            <input class=\"routine\" type = submit name = nm1 value =\"Routine\"  />\n");
      out.write("            <input class=\"holiday\" type = submit name = nm1 value = \"Holiday List\" />\n");
      out.write("            <input class =\"complain\" type =submit name =nm1 value=\"Complains\"/>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
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
