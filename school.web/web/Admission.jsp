<%-- 
    Document   : Admission
    Created on : Jun 3, 2018, 11:52:46 PM
    Author     : TT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="layoutCss.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
             form{
                position: relative;
                left: 50px;
                top: 155px;
                font-family: Times New Roman,Verdana;
                font-weight: 400;font-size: 24px;
            } 
            #lft{ position: absolute; left: 0px;top: 50px;}
            #rht{ position: absolute; left: 650px;top: 50px;}
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
    <form action="AdmServlet" method="POST">    
        <% String ch1 = (String)session.getAttribute("err1");
            if(ch1!=null)
            out.println(ch1);
        %><br/>
        <marquee style="font-size: 20px;color:tomato;">
            Please provide the necessary details..
        </marquee>
        <div id="lft">
            Full Name : <input type="text" name="nm" value=""  /> <br/> <br/>
            Sex : <input type="radio" name="sex" value="M" />Male
                <input type="radio" name="sex" value="F" />Female <br/> <br/>
            Date of Birth : <input type="text" name="dob" value=""   /> <br/> <br/>
            Class : <input type="text" name="cls" value=""  /> <br/> <br/>
            Present Address : <input type="text" name="preAdd" value=""  /> <br/> <br/>
            Permanant Address : <input type="text" name="permAdd" value="" /> <br/> <br/>
            Father's name : <input type="text" name="fname" value="" /> <br/> <br/>
            Father's Occupation : <input type="text" name="focc" value="" /> <br/> <br/>
        </div>    
        <div id="rht">
             Mother's name : <input type="text" name="mname" value="" /> <br/> <br/>
            Mother's Occupation : <input type="text" name="mocc" value="" /> <br/> <br/>
            Mobile no. : <input type="text" name="no" value="" /> <br/> <br/>
            Alternative Mobile No. : <input type="text" name="ano" value="" /> <br/> <br/>
            Email Id: <input type="text" name="email" value="" /> <br/> <br/>
            Password : <input type="password" name="pass1" value="" /> <br/> <br/>
            Confirm Password : <input type="password" name="pass2" value="" /> <br/> <br/>
            <input type="submit" value="OK" />
        </div>
    </body>
</html>
