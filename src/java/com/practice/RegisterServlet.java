
package com.practice;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;

public class RegisterServlet extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Welcome to RegisterServlet</h2>");
        String name = request.getParameter("user_name");
        String password = request.getParameter("user_password");
        String email = request.getParameter("user_email");
        String gender = request.getParameter("user_gender");
        String course = request.getParameter("user_course");
        String cond = request.getParameter("condition");
        if(cond != null)
        {
            if(cond.equals("checked"))
            {
                out.println("<h2> Username : " + name +" </h2>");
                out.println("<h2> Password : " + password +" </h2>");
                out.println("<h2> Email : " + email +" </h2>");
                out.println("<h2> Gender : " + gender +" </h2>");
                out.println("<h2> Course : " + course +" </h2>");    
            }
            else
            {
         
            }
            
        }
        else
        {
            System.out.println("You have not accepted T&c ");
            out.println("<h1>You have not accepted T&c</h2>");
        }
        
        
    }
    
}
