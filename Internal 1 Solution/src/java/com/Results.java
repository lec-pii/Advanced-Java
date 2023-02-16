/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author tumelo.pii
 */
public class Results extends HttpServlet {

    protected int calcMarks(HttpServletRequest request) {
        int marks = 0;

        if (request.getParameter("Q1").equals("Stateless")) {
            marks++;
        }
        if (request.getParameter("Q2").equals("input tag")) {
            marks++;
        }
        if (request.getParameter("Q3").equals("JDBC template")) {
            marks++;
        }
        if (request.getParameter("Q4").equals("Server")) {
            marks++;
        }
        if (request.getParameter("Q5").equals("JDBC template")) {
            marks++;
        }
        //question 6//convert Array to list so as to use List methods
        List<String> q6 = Arrays.asList(request.getParameterValues("Q6")); //convert Array to list so as to use List methods i.e contains
        /* there are 4 options only 3 are correct, so check if 
            the array size is 3 and does not contain the wrong answer */
        if (q6.size() == 3 && !(q6.contains("200.0.4.22"))) { 
            marks++;
        }

        //question 7
        List<String> q7 = Arrays.asList(request.getParameterValues("Q7")); //convert Array to list so as to use List methods i.e contains
        /*
        Checking all possible answers in no particular order,
        for each method method, the answer could be method name with lowercase or UPPERCASE also with or without paranthesis 
        */
        if (q7.contains("init") || q7.contains("init()") || q7.contains("INIT") || q7.contains("INIT()")) {
            if (q7.contains("service") || q7.contains("service()") || q7.contains("SERVICE") || q7.contains("SERVICE()")) {
                if (q7.contains("destroy") || q7.contains("destroy()") || q7.contains("DESTROY") || q7.contains("DESTROY()")) {
                    marks++;
                }
            }
        }

        if (request.getParameter("Q8").equals("404")) {
            marks++;
        }
        if (request.getParameter("Q9").equals("true")) {
            marks++;
        }
        if (request.getParameter("Q10").equals("Using Servlet object")) {
            marks++;
        }

        return marks;
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Results</title>");
            //styles
            out.println("<style>"
                    + "body{"
                    + "display: flex;"
                    + "flex-direction: column;"
                    + "}"
                    + ".results{"
                    + "display: flex;"
                    + "flex-direction: column;"
                    + "}"
                    + "h1,p{"
                    + "margin: auto"
                    + "}"
                    + ".pass{"
                    + "color:green;"
                    + "margin: auto;"
                    + "}"
                    + ".fail{"
                    + "color:red;"
                    + "margin: auto;;"
                    + "}"
                    + "p{"
                    + "font-size:14px;"
                    + "}"
                    + "</style>");
            out.println("</head>");
            //Body
            out.println("<body>");
            //passsing condition
            if (calcMarks(request) > 4) {
                out.println("<div class='results pass'>");
                out.println("<h1>" + calcMarks(request) + "/10</h1>");
                out.println("<p><b>Congratulations</b> " + request.getParameter("fname") + "! You have passed your test.</p>");
                out.println("</div>");
            } else { //failling
                out.println("<div class='results fail'>");
                out.println("<h1>" + calcMarks(request) + "/10</h1>");
                out.println("<p><b>Sorry</b> " + request.getParameter("fname") + "! You have not met minimum requirements to pass the test try your luck again next time.</p>");
                out.println("</div>");
            }
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
