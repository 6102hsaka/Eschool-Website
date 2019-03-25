<%-- 
    Document   : feedback
    Created on : Jun 5, 2018, 5:54:47 PM
    Author     : TT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="layoutCss.css">
    <style>
            hy { position: absolute; top:200px;left 100px;}
            
        </style>
    </head>
    <body>
        <div id="head">
            <h1>XYZ School</h1>   <h6>2/1 Vidyasagar Road,Howrah-1</h6>
            <hx><%
                String str = (String)session.getAttribute("user");
                out.println("Hello "+ str);
                %><br/>
                <a href=logoutServlet>logout</a>
            </hx>
    <hr>
    <hm>
            <a href="home.jsp">Return Home</a>
    </hm>
        </div>
    <hy>
    <form action="feedback.jsp" method="POST">
        Give your feedback : <br/><br/>
        <textarea name="feed" rows="5" cols="20">
        </textarea><br>
        <input type="submit" value="Submit" />
    </form></hy>
    <%
       Connection cn = null; PreparedStatement pst=null,pst2=null;ResultSet rs=null;
       int res=0;   
       String str1 = request.getParameter("feed"); 
       if(str1!=null)
       {
           try
           {
                Class.forName("com.mysql.jdbc.Driver");
                cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/eschool", "root", null);
                String str2="Insert into feedback value(?,?)" ;
                pst=cn.prepareStatement(str2);
                pst.setString(1 , str);
                pst.setString(2, str1);
                res=pst.executeUpdate();
                if(res==0)
                {
                    out.println("Error Occured!!!  Try again later");
                }
                else
                {
                    out.println(" Thank you for your feedback");
                }
           }
        catch(ClassNotFoundException | SQLException er)
           {
               out.println(er.getMessage());
           }
       }
       %>
       <div id="tb">
        <table border="0">
            <tr>
                <td style="padding-right: 60px;padding-left: 25px;">
                    <a href="Admission.jsp">Admission</a>
                </td>
                <td style="padding-right: 60px;">
                    <a href="about.jsp">About us</a>
                </td>
                <td style="padding-right: 60px;">
                    <a href="contact.jsp">Contacts us</a>
                </td>
                <td>
                    <a href="feedback.jsp">Feedback</a>
                </td>
            </tr>
        </table>
    </div>
    </body>
</html>
