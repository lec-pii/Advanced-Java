/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;


/**
 *
 * @author tumelo.pii
 */
@WebServlet(urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            //getParameter to get a single pameter value using input name
            String fname = request.getParameter("fname");
            out.println(fname + "<br>");
            //
            String[] hobbies = request.getParameterValues("Hobbies");
            for(int i=0 ; i < hobbies.length ; i++){
                out.println(hobbies[i] + "<br>");
            }
            //
            out.println("<br> Getting All the parameter names <br>");
            Enumeration<String> paramNames = request.getParameterNames();
            while( paramNames.hasMoreElements() ){
                String paramName = paramNames.nextElement();
                
                //At this point you have the names of the different inputs in 
                //your form so you can easily gett the values as well
                
                //Getting Values
                out.println(paramName + " : ");
                String[] paramValues = request.getParameterValues(paramName);
                for( String pvalue : paramValues){
                    out.println(pvalue + ",");
                }
                out.println("<br><br>");
            }
            
            
            
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

      
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
