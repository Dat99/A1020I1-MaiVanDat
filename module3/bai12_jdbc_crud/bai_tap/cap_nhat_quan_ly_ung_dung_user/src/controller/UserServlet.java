package controller;

import model.bean.User;
import model.service.UserService;
import model.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

@WebServlet(name = "UserServlet", urlPatterns = {"/","/user"})
public class UserServlet extends HttpServlet {
    private UserService userService = new UserServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                try {
                    saveUser(request,response);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                break;
            case "edit":
                try {
                    updateUser(request,response);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                break;
            default:
                userHome(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createUser(request,response);
                break;
            case "edit":
                editUser(request,response);
                break;
            case "delete":
                try {
                    deleteUser(request,response);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                break;
            case "find":
                findCountryUser(request,response);
                break;
            case "sort":
               // sortUser(request,response);
            default:
                userHome(request, response);
        }
    }



    // ------------------------User Home--------------------//
    private void userHome(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("users", this.userService.findAll());
        try {
            request.getRequestDispatcher("list.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    //--------------- create user-------------------//

    private void createUser(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("create.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

// ----------------------------save user---------------//

    private void saveUser(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");

        this.userService.insertUser(new User(name,email,country));
        try {
            request.getRequestDispatcher("create.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
    //---------------------delete-----------------//
    private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        this.userService.deleteUser(id);
        try {
            response.sendRedirect("/");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //-------------edit----------//
    private void editUser(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.findById(id);
        request.setAttribute("users", user);
        try {
            request.getRequestDispatcher("edit.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
//-----------------------update--------------//
private void updateUser(HttpServletRequest request, HttpServletResponse response) throws SQLException {
    int id = Integer.parseInt(request.getParameter("id"));
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String country = request.getParameter("country");

    User user = new User(id,name,email, country);
    if (this.userService.updateUser(id, user)){
        userHome(request,response);
    }else {
        try {
            request.getRequestDispatcher("/edit.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
}
//---------------Find user-----------//
private void findCountryUser(HttpServletRequest request, HttpServletResponse response) {
    String country = request.getParameter("country");
    List<User> userList = this.userService.findCountry(country);

    request.setAttribute("users",userList);
    try {
        request.getRequestDispatcher("list.jsp").forward(request,response);
    } catch (ServletException | IOException e) {
        e.printStackTrace();
    }
}
//---------- sort name user--------------//

   /* private void sortUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> userList = this.userService.findAll();
        Collections.sort(userList);
        request.setAttribute("users",userList);
        request.getRequestDispatcher("list.jsp").forward(request,response);
    } */

}
