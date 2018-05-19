package model.dao;

import model.bean.Users;

import java.util.List;

public interface UserDao {
    List<Users> findAll();
    boolean saveUser(Users users);
}
