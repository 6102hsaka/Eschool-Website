<%-- 
    Document   : Add
    Created on : Jun 3, 2018, 4:34:14 AM
    Author     : TT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Account</title>
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
        <div id="head"><h1>XYZ School</h1> <h6>2/1 Vidyasagar Road,Howrah-1</h6> <hr></div>
            <hxy><%
                String str=null;
                str=(String)session.getAttribute("is");
                if(str!=null)
                {
                    out.println("password not matched !!!!\n");
                    out.println("Redo form fillup");
                }
                %></hxy>
        <form action="AddServlet" method="POST">
            
             <br/>
            Enter the User Name : <br/>
            <input type="text" name="nm" value="" /> <br/><br/>
            Select Your Designation :<br/>
            <select name="deg">
                <option>Teacher</option>
                <option>Parent</option>
                <option>Student</option>
            </select> <br/> <br/>
            Create Password : <br/>
            <input type="password" name="pass1" /> <br/><br/>
            Confirm Password : <br/>
            <input type="password" name="pass2" /> <br/><br/>
            <input type="submit" value="Add Account" />
        </form>
    </body>
</html>
