package model.dao;

import model.bean.Roles;

import java.util.List;

public interface RoleDao {

    List<Roles> findAll();
    boolean saveRole(Roles roles);
}
