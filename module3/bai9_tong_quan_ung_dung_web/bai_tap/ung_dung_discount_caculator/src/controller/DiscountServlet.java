package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", urlPatterns = "/discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float percent = Float.parseFloat(request.getParameter("percent"));
        float price = Float.parseFloat(request.getParameter("price"));
        float amount   = price * percent * 0.01f;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Rate: " + percent + "</h1>");
        writer.println("<h1>USD: " + price + "</h1>");
        writer.println("<h1>VND: " + amount + "</h1>");
        writer.println("</html>");

//        request.getRequestDispatcher("WEB-INF/discount/index.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//       response.sendRedirect("WEB-INF/discount/index.jsp");
         request.getRequestDispatcher("discount/index.jsp").forward(request, response);

    }
}