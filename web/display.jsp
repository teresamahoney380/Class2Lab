<%-- 
    Document   : display
    Created on : Jan 27, 2014, 7:35:17 PM
    Author     : Owner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Display Appropriate Greeting</h1>
        <p>
            <% 
            out.print("<br>" + request.getAttribute("greetingMessage"));
            %>
        </p>
    </body>
</html>
