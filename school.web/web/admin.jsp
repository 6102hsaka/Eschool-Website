<%-- 
    Document   : admin
    Created on : Jun 5, 2018, 12:00:30 AM
    Author     : TT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin</title>
        <link rel="stylesheet" href="layoutCss.css">
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
    <div style="position: fixed;left: 400px;top: 200px;font-size: 25px;">
        <ul type="circle">
            <li><a href = "createAdmin.jsp">Create Admin</a>  
            <li><a href = "alterNotice.jsp">Alter Notice Board</a>
        </ul>
    </div>
    </body>
</html>
