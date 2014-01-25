<%-- 
    Document   : PageGenerator2
    Created on : Jan 25, 2014, 12:22:55 PM
    Author     : Owner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page LaB 3</title>
        <link rel="stylesheet" type="text/css" href="newcss.css">
    </head>
    <body>
        <h1>Hello Terry Moe!</h1>
        <table
        <%
            for (int i=1; i<4;i++){
                out.println("<tr>");
              for (int j=1; j<4; j++){
                  
                  out.println("<td>Row "+i+" Col "+j+"</td>");
                  
              } 
              out.println("</tr>");
            }
            %>
    </table>
    <br/>
    <table border="1" width="30" cellspacing="1">
        <thead>
            <tr>
                <th>Col 1</th>
                <th>Col 2</th>
                <th>Col 3</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>R1C1</td>
                <td>R1C2</td>
                <td>R1C3</td>
            </tr>
            <tr>
                <td>R2C1</td>
                <td>R2C2</td>
                <td>R2C3</td>
            </tr>
            <tr>
                <td>R3C1</td>
                <td>R3C2</td>
                <td>R3C3</td>
            </tr>
        </tbody>
    </table>

    </body>
</html>
