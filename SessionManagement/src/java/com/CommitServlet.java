/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import uni.User;

/**
 *
 * @author tumelo.pii
 */
@WebServlet(name = "CommitServlet", urlPatterns = {"/CommitServlet"})
public class CommitServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss"); 
        HttpSession session = request.getSession(false);
        if (session != null) {
            User usr = (User) session.getAttribute("user");
            usr.setGender(request.getParameter("gender"));
            
            PrintWriter out = response.getWriter();
            out.println("<h1>Hello : " + usr.getFirstName() +"</h1>");
            out.println("<h3>User Info : " + usr.toString() +"</h3>");
            out.println("<h5>SessionID : " + session.getId() +"</h5>");
            out.println("<h5>Session created at : " + dateFormat.format(session.getCreationTime()) +"</h5>");
            out.println("<h5>Session Last Acceess time : " + dateFormat.format(session.getLastAccessedTime()) +"</h5>");
            session.invalidate();
            
        }

    }

}
