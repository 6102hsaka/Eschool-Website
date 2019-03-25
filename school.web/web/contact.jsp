<%-- 
    Document   : contact
    Created on : Jun 5, 2018, 5:41:30 PM
    Author     : TT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Us</title>
        <link rel="stylesheet" href="layoutCss.css">
        <style>
            #lft {position: fixed;top: 320px;left:250px;font-size: 18px;}
            #cnt {position: fixed;top: 320px;left:610px;font-size: 18px;}
            #rht {position: fixed;top: 320px;left:1000px;font-size: 18px;}
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
    <div id="desc" style="position: fixed;top: 220px;left: 520px;">
        <center style="font-size:28px;font-family: cursive;color: #3333ff">Feel Free to Contact Us </center><br/>
    </div>
    <div id="lft">
        <img src="img_avatar.png" style="height:100px;width:70px;"><br/>
        Principal: Dr. A. Sharma<br/>
        Mobile No. : 033-88811105 <br/>
        email id : asharma@xyzschool.com
    </div>
    <div id="cnt">
        <img src="img_avatar.png" style="height:100px;width:70px;"><br/>
        Vice Principal: Mr. K. Das <br/>
        Mobile No. : 033-00001236 <br/>
        email id : kdas@xyzschool.com
    </div>
    <div id="rht">
        <img src="img_avatar.png" style="height:100px;width:70px;"><br/>
        Security Head : Mr. S. Gupta <br/>
        Mobile No. : 033-32339910 <br/>
        email id : sgupta@xyzschool.com
    </div>
    
    </body>
</html>
