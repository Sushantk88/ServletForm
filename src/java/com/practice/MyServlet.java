
package com.practice;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;


public class MyServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        System.out.println("This is doGet() method.....");
        PrintWriter out = response.getWriter();
        out.println("<h1> This is doGet() method from MyServlet class</h1>");
    }
}
