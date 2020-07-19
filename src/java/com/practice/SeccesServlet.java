
package com.practice;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;


public class SeccesServlet extends HttpServlet{
    
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("Success Servlet");
        out.println("<h2>Successfuly Registered</h2>");
        
    }
    
    
}
