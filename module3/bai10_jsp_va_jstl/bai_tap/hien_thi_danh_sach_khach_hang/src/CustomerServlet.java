import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet",urlPatterns = "/abc")
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Mai Văn Đạt", "21/5/1999","Quảng Bình","Images/dat.jpg"));
        customerList.add(new Customer("Đặng Văn Thuận", "8/10/1997","Đà Nẵng","Images/thuan.jpg"));
        customerList.add(new Customer("Lê Nguyễn Trung Thông", "8/10/2000","Quảng Nam","Images/thong.jpg"));

        request.setAttribute("customerListServlet", customerList);
        request.getRequestDispatcher("list_jstl.jsp").forward(request, response);

    }
}
