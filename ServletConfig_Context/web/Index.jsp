<%-- 
    Document   : Index.jsp
    Created on : 31 Jan 2023, 08:56:26
    Author     : tumelo.pii
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            div{
                display: flex;
                justify-content: space-around;
            }
        </style>
    </head>
    <body>
        <h1>Hello World!</h1>
        <div>
            <form action="Servlet1">
                <input type="submit" value="Goto Servlet 1">
            </form>
            <form action="Servlet2">
                <input type="submit" value="Goto Servlet 2">
            </form>
        </div>

    </body>
</html>
