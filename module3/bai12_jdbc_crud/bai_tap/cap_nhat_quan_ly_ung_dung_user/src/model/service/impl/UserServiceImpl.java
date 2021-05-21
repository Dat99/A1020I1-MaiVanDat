package model.service.impl;

import model.bean.User;
import model.repository.UserRepository;
import model.repository.impl.UserRepositoryImpl;
import model.service.UserService;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository = new UserRepositoryImpl();

    @Override
    public void insertUser(User user) throws SQLException {
        this.userRepository.insertUser(user);

    }

    @Override
    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    @Override
    public User findById(int id) {
        return this.userRepository.findById(id);
    }

    @Override
    public void deleteUser(int id) throws SQLException {
        this.userRepository.deleteUser(id);
    }

    @Override
    public boolean updateUser(int id, User user) throws SQLException {
          this.userRepository.updateUser(id,user);
        return false;
    }

    @Override
    public List<User> findCountry(String country) {
        return this.userRepository.findCountry(country);
    }
}
