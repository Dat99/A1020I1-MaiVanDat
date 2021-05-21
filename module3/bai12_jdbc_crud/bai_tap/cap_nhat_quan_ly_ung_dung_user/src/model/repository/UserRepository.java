package model.repository;

import model.bean.User;

import java.sql.SQLException;
import java.util.List;

public interface UserRepository {
     void insertUser(User users) throws SQLException;
     List<User> findAll();
     User findById(int id);
     boolean deleteUser(int id) throws SQLException;
     void updateUser(int id, User user) throws SQLException;
     List<User> findCountry(String country);

}
