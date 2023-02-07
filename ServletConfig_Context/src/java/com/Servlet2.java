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
public class Servlet2 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ServletConfig config = getServletConfig();
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<h2> Information from Servlet config </h2>");
        out.println("<h5>"+ config.getInitParameter("msg") +"</h5><br>");
        
        
        ServletContext application = getServletContext();
        out.println("<h2> Information from ServletContext config </h2>");
        out.println("<h5>"+ application.getInitParameter("message") +"</h5>");
    }
    


}
