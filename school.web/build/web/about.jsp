<%-- 
    Document   : about
    Created on : Jun 5, 2018, 6:22:01 PM
    Author     : TT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>About Us</title>
        <link rel="stylesheet" href="layoutCss.css">
        <style>
            
            #abt { position: absolute;top:200px;left:30px;right:30px;font-family: cursive;
                   font-size: 25px;}
        </style>
    </head>
    <body>  
        <div id="head">
            <h1>XYZ School</h1>   
            <h6>2/1 Vidyasagar Road,Howrah-1</h6>
            <hx>
            <%
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
    <div id="abt">
        
        <b style="color: tomato;">Message from Principle</b><br/>
        <img src="img_avatar.png" style="height:100px;width:70px;"><br/>
        Welcome to our School.We continue to rank among best School in the Nation.Our primary goal is 
        to become one of the most prominent and excellent school in the world.We would be delighted
        to be involved in the education of your child and to foster in him/her the value based education.
        <br/><br/>
        <b style="color: tomato;">Why Choose Us?</b> <br/>
        The School opens a world of possibilities for student from Preschool to grade 12 by providing
        the rigorous bilingual Education,inclusive cultural Experience and global mindset required to learn
        and lead today and in the future.
        <br/><br/>
        <b style="color: tomato;">Co-Curriculum Activities</b><br/>
        The School attaches great importance to co-curriculam activities among other measures.
        The Students are divided into four houses with a aview to fostering group loyalty and a spirit
        of healthy competition.<br>
        &bigcirc; Physical Traning and games are compulsory for all students unless otherwise medically advised.
        <br/><br/>
        <b style="color: tomato;">Health</b><br/>
        The School takes regular care of students' health. They are regular examined by the team of
        able doctors.
        <br/><br/>
     </div>
    </body>
</html>
