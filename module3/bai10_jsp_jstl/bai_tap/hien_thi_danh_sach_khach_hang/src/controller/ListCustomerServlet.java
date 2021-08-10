package controller;

import model.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ListCustomerServlet", urlPatterns = "/customer")
public class ListCustomerServlet extends HttpServlet {
    private static List<Customer> customerList;
    @Override
    public void init(){
        customerList = new ArrayList<>();
        customerList.add(new Customer("Mai Văn Đạt","21-05-1999","Quảng Bình","2.jpg"));
        customerList.add(new Customer("Nguyễn Thùy Nhiên","06-06-1999","Huế","1.jpg"));
        customerList.add(new Customer("Nguyễn Văn Lịch","28-07-1999","Quảng Bình","4.jpg"));
        customerList.add(new Customer("Lê Hữu Đức","7-03-1999","Quảng Trị","3.jpg"));
        customerList.add(new Customer("Đào Thảo Vân","06-06-1999","Quảng Bình","5.jpg"));
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      request.setAttribute("customerList",customerList);

      request.getRequestDispatcher("/listCustomer/customer.jsp").forward(request,response);
    }
}
