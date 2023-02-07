<%-- 
    Document   : form3
    Created on : 31 Jan 2023, 20:23:53
    Author     : tumelo.pii
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="CommitServlet">
            <pre>
                Gender
                <input type="Radio" name="gender" value="male" /> Male
                <input type="Radio" name="gender" value="female" /> Female
                
                <input type="submit" />
            </pre>
        </form>
    </body>
</html>
