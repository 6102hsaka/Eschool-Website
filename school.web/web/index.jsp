<%-- 
    Document   : index
    Created on : Jun 3, 2018, 3:04:52 AM
    Author     : TT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import=" java.util.Random " %>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>XYZ School</title>
        <link rel="stylesheet" href="layoutCss.css">
        <style>
            form{
                position: fixed;
                left: 600px;
                top: 200px;
                font-family: Times New Roman,Verdana;
                font-weight: 400;
            }
        </style>
    </head>
    <body>
        <div id="head">
            <h1>XYZ School</h1> <h6>2/1 Vidyasagar Road,Howrah-1</h6> <hr>
        </div>
       <hx><%
            String st = (String)session.getAttribute("is");
            response.setContentType("text/html;charset=UTF-8");
            response.setHeader("Cache-control", "no-cache,no-store,must-revalidate");
            response.setHeader("Pragma", "no-cache");
            response.setHeader("Expires", "0");
            if(st!=null)
            out.println(st);
            %></hx>
        <form action="loginServlet" method="POST">
            Enter the User Name : <br/>
            <input type="text" name="nm" value="" /> <br/><br/>
            Enter the Password : <br/>
            <input type="password" name="pass" /> <br/><br/>
            Enter the Captcha : <br/>
            <%
                Random rd = new Random();
                int x=0,y=0;
                x = rd.nextInt(100);
                y = rd.nextInt(100);
                out.println(x + " + " + y);
                int sum=x+y;
                session.setAttribute("check", sum);
            %> <br/>
            <input type="text" name="cpt" value="0" /> <br/><br/>
            <input type="submit" value="Login" /> <br/> <br/>
            <a href="Add.jsp" style="text-decoration: none;color: blue">New ? Create Account</a>
        </form>
            
    </body>
</html>
