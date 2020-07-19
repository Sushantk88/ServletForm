
package com.practice;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;



public class UnsuccesServlet extends HttpServlet{
    
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>You have not accepted T&C </h2>");
        
    }
    
}
