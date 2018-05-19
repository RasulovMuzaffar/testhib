package model.dao;

import model.bean.User;
import model.config.HibernateUtil;
import org.hibernate.Session;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    Session session = HibernateUtil.getSessionFactory().openSession();

    @Override
    public List<User> findAll() {
        List<User> list = new ArrayList<>();
        try {
            session.beginTransaction();
            Query query = session.createQuery("from User", User.class);
            list = query.getResultList();
            session.getTransaction().commit();
            return list;
        } catch (Exception e) {
            return null;
        }

    }

    public boolean saveUser(User user) {
        try {
            session.beginTransaction();

            session.save(user);
            session.getTransaction().commit();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
