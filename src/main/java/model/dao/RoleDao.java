package model.dao;

import model.bean.Role;

import java.util.List;

public interface RoleDao {

    List<Role> findAll();
    boolean saveRole(Role role);
}
