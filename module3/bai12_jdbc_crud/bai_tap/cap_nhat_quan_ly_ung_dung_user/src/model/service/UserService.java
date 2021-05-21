package model.service;

import model.bean.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService {
    void insertUser(User users) throws SQLException;
    List<User> findAll();
    User findById(int id);
    void deleteUser(int id) throws SQLException;
    boolean updateUser(int id, User user) throws SQLException;
    List<User> findCountry(String country);
}
