<%-- 
    Document   : alterNotice
    Created on : Jun 7, 2018, 11:21:05 PM
    Author     : TT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alter Notice Board</title>
        <link rel="stylesheet" href="layoutCss.css">
        <style>
            #lft { position: absolute; top:160px;left:75px;}
            #rht { position: absolute; top:160px;left:450px;}
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
    <div id = "lft">
         <h3>Add Notice</h3>
        <form action="AddNtServlet" method="POST">
            Enter Description : <br/>
            <input type="text" name="sub" value="" /> <br/><br/>
            <input type="submit" value="Add" />
        </form>
        <%
            String msg= (String)session.getAttribute("msg");
            if(msg!=null)
            out.println(msg);
        %>
    </div>
        <div id="rht">
            <h3> Delete Notice</h3>
            <form action="DelNtServlet" method="POST">
                Enter Description :  <br/>
                <input type="text" name="sub" value="" /> <br/><br/>
                <input type="submit" value="delete" /> 
            </form>
        <%
            String msg1= (String)session.getAttribute("msg1");
            if(msg1!=null)
            out.println(msg1);
        %>
        </div>
    </body>
</html>
