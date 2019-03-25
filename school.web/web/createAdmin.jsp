<%-- 
    Document   : createAdmin
    Created on : Jun 7, 2018, 11:19:03 PM
    Author     : TT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Make new Admin</title>
        <link rel="stylesheet" href="layoutCss.css">
    </head>
    <body>
        <div id ="head">
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
    <hy style="position: relative; top:140px;left:30px;">
        <%
            Connection cn = null; PreparedStatement pst=null,pst2=null;ResultSet rs=null;
            int res=1; String msg=null;
        try
           {
                Class.forName("com.mysql.jdbc.Driver");
                cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/eschool", "root", null);
                String str1="select username from login where id='Teacher' and verification=0";
                pst=cn.prepareStatement(str1);
                rs=pst.executeQuery();
                int i=0;
                out.println("list of Teacher");
                out.println("<table border=1 cellpading=4>");
                out.println("<tr> <td>Index</td> <td>username</td> </tr>");
                while(rs.next())
                {
                    ++i;
                    out.println("<tr><td>"+ i + "</td>");
                    out.println("<td>"+ rs.getString(1) + "</td></tr>");
                }
                out.println("</table>");
           }
        catch(ClassNotFoundException | SQLException er)
           {
               out.println(er.getMessage());
           }
       
    %>
    <br/><br/><br/>
    <form action="createAdmin.jsp" method="POST" >
        Enter username to make Admin : <br/>
        <input type="text" name="un" value="" /> <br/><br/>
        <input type="submit" value="Make Admin" />
    </form>
    <%
       try
           {
                
                String un=request.getParameter("un");
                String str2= " update login set verification=111 where username=?";
                pst=cn.prepareStatement(str2);
                pst.setString(1, un);
                res=pst.executeUpdate();
           }
        catch(SQLException er) 
           {
               out.println(er.getMessage());
           }  
        finally
        {
            
           
               if(res !=1 )
                {
                    msg=" Error occured ";
                }
               else 
                {
                    msg= "Done";
                }
            if(str!=null)
                out.println(msg);
        }
    %>   
    </hy>
    </body>
</html>
