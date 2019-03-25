<%-- 
    Document   : continue
    Created on : Jun 4, 2018, 11:00:30 PM
    Author     : TT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="layoutCss.css">
        <style>
             hy{
                position: relative;
                left: 600px;
                top: 200px; color: tomato;
                font-family: Times New Roman,Verdana;
                font-weight: 400;font-size: 24px;
            } 
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Continue</title>
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
    <hy>
        Record Added Sucessfully....
        <br/>
        <a href="home.jsp">click here to continue</a>
    </hy>
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
    </body>
</html>
