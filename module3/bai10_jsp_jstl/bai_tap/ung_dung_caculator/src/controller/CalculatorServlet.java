package controller;

import model.Calculator;
import model.Calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/calculator")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String f = request.getParameter("first");
        Float first = Float.parseFloat(f);
        String s = request.getParameter("second");
        Float second = Float.parseFloat(s);

        char operator = request.getParameter("operator").charAt(0);
        PrintWriter writer=response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Result:</h1>");
        try {
            float result= Calculator.caculator(first,second,operator);
            writer.println(first + " " + operator + " " + second + " = " + result);
        }catch (Exception exception){
            writer.println("Error: " + exception.getMessage());
        }
        writer.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("Result","result");
        request.getRequestDispatcher("/caculator/calculator.jsp").forward(request, response);
    }
}
