package model.dao;

import model.bean.Roles;
import model.config.HibernateUtil;
import org.hibernate.Session;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class RoleDaoImpl implements RoleDao {
    Session session = HibernateUtil.getSessionFactory().openSession();

    @Override
    public List<Roles> findAll() {
        List<Roles> list = new ArrayList<>();
        try {
            session.beginTransaction();
            Query query = session.createQuery("from Roles", Roles.class);
            list = query.getResultList();
            session.getTransaction().commit();
            return list;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean saveRole(Roles roles) {
        try {
            session.beginTransaction();

            session.save(roles);
            session.getTransaction().commit();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
