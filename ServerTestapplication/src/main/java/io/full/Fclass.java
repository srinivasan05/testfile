package io.full;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Fclass extends HttpServlet {

 
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {
      
    response.setContentType("text/html");
    response.setCharacterEncoding("UTF-8");
    
    PrintWriter out = response.getWriter();
    
    String fname=request.getParameter("fname");
    String lname=request.getParameter("lname");
    
    out.println(fname);
    out.println(lname);
    
    

  }
}