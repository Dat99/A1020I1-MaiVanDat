package controllers.servlet;

import controllers.model.Customer;
import controllers.service.CustomerService;
import controllers.service.CustomerServiceFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


//@Controller
//public class CustomerServlet {
//    @GetMapping("/customers")
//    public String showList() {
//        return "list";
//    }
//}


@Controller
class CustomerController {
    private CustomerService customerService = CustomerServiceFactory.getInstance();

    @GetMapping("/customers")
    public String showList(HttpServletRequest request) {
        List<Customer> customers = customerService.findAll();
        request.setAttribute("customers", customers);
        return "list";
    }
}