/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author tumelo.pii
 */
public class Servlet1 extends HttpServlet {
    
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ServletConfig config = getServletConfig();
        PrintWriter out = response.getWriter();
        out.println("<h1>"+ config.getInitParameter("msg") +"</h1><br>");
        
        ServletContext application = getServletContext();
        out.println("<h1>"+ application.getInitParameter("message") +"</h1>");
    }
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ServletConfig config = getServletConfig();
        PrintWriter out = response.getWriter();
        out.println("<h1>"+ config.getInitParameter("msg") +"</h1><br>");
        
        ServletContext application = getServletContext();
        out.println("<h1>"+ application.getInitParameter("message") +"</h1>");
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
}
