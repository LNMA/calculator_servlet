package com.mycompany.calculator_servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class calculator extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        try(PrintWriter out = response.getWriter()){
        double num1 = Double.parseDouble(request.getParameter("num1"));
        String op = request.getParameter("operation");
        double num2 = Double.parseDouble(request.getParameter("num2"));
        
            if (op.equals("sum")) {
                out.print(num1+" + "+num2+" = "+(num1+num2));
            }
            if (op.equals("sub")) {
                out.print(num1+" - "+num2+" = "+(num1-num2));
            }
            if (op.equals("mul")) {
                out.print(num1+" * "+num2+" = "+(num1*num2));
            }
            if (op.equals("div")) {
                out.print(num1+" / "+num2+" = "+(num1/num2));
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
