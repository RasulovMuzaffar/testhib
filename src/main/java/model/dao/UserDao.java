package model.dao;

import model.bean.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
    boolean saveUser(User user);
}
