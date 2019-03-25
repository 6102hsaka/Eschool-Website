<%-- 
    Document   : home
    Created on : Jun 3, 2018, 5:21:05 AM
    Author     : TT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link rel="stylesheet" href="layoutCss.css">
        <style>
            .mySlides {display:none;width:750px;height:400px;position: absolute;left: 0px;top:188px;
            border: 5px solid tomato;}
            #nb { position: absolute;top: 160px;right:15px;font-size: 35px;background-color: orangered;width: 550px;}
            #nbin { position: absolute;top :auto;right: auto;height: 265px;background-color: linen;width: 550px;font-size: 20px;}
        </style>
    </head>
    <body>
        <div id="head">
                    <%! Connection cn = null; PreparedStatement pst=null,pst2=null;ResultSet rs=null,rs1=null;int res=0; String str;%>
        <h1>XYZ School</h1>   <h6>2/1 Vidyasagar Road,Howrah-1</h6>
        <hx><%
            str = (String)session.getAttribute("user");
            out.println("Hello "+ str);
        %><br/>
        <a href=logoutServlet>logout</a>
        </hx>
        <hr>
        <hm>
        <%
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
        %>
        </hm>
    </div>
    <div id="nb">
        <center>Latest Announcement</center>
        <div id="nbin">    
        <marquee behavior="scroll" direction="up" scrollamount="4">
            <%
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
            %>
        </marquee>
         </div>
    </div>
        <!-- Image Slider-->
  <div id="slide" >
  <img class="mySlides" src="front.jpg" >
  <img class="mySlides" src="back.jpg">
  <img class="mySlides" src="chess.png">
  <img class="mySlides" src="basketball.jpg">
  <img class="mySlides" src="primary.jpg"><img class="mySlides" src="secondary.jpg">
</div>

<script>
var myIndex = 0;
carousel();

function carousel() {
    var i;
    var x = document.getElementsByClassName("mySlides");
    for (i = 0; i < x.length; i++) {
       x[i].style.display = "none";  
    }
    myIndex++;
    if (myIndex > x.length) {myIndex = 1}    
    x[myIndex-1].style.display = "block";  
    setTimeout(carousel, 1500); // Change image every 2 seconds
}
</script>
    <div id="tb">
        <table border="0" style="background-color: #ffff66;width:760px;">
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
<div id="ntc">
        <form action="dwld" method="get">
        <center>Download Links</center>
            <input class="admission" type = submit name = nm1 value = "Admission List" />
            <input class="attendance" type = submit name = nm1 value ="Attendance List"  />
            <input class="assignment" type = submit name = nm1 value ="Assignment"  />
            <input class="exam" type = submit name = nm1 value ="Exam Schedule"  />
            <input class="result" type = submit name = nm1 value ="Result"  />
            <input class="routine" type = submit name = nm1 value ="Routine"  />
            <input class="holiday" type = submit name = nm1 value = "Holiday List" />
            <input class ="complain" type =submit name =nm1 value="Complains"/>
    </form>
</div>
    </body>
</html>
