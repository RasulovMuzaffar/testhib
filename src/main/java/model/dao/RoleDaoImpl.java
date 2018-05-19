package model.dao;

import model.bean.Role;
import model.config.HibernateUtil;
import org.hibernate.Session;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class RoleDaoImpl implements RoleDao {
    Session session = HibernateUtil.getSessionFactory().openSession();

    @Override
    public List<Role> findAll() {
        List<Role> list = new ArrayList<>();
        try {
            session.beginTransaction();
            Query query = session.createQuery("from Role", Role.class);
            list = query.getResultList();
            session.getTransaction().commit();
            return list;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean saveRole(Role role) {
        try {
            session.beginTransaction();

            session.save(role);
            session.getTransaction().commit();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
