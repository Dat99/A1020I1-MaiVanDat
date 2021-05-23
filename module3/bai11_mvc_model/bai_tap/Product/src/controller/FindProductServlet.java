package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "FindProductServlet", urlPatterns = "/find_product")
public class FindProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        if (action.equals("find")){
            findProduct(request,response);
        } else {
            request.getRequestDispatcher("product/view.jsp").forward(request,response);
        }
    }

    private void findProduct(HttpServletRequest request, HttpServletResponse response) {

    }
}
