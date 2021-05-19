package model.repository;

import model.bean.User;

import java.sql.SQLException;
import java.util.List;

public interface UsersRepository {
    List<User> findAll();
    User findById (int id);
    boolean deleteUser (int id);
    void updateUser (int id, User user);
    void insertUser (User user);
}
