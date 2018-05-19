package model.dao;

import model.bean.Users;
import model.config.HibernateUtil;
import org.hibernate.Session;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    Session session = HibernateUtil.getSessionFactory().openSession();

    @Override
    public List<Users> findAll() {
        List<Users> list = new ArrayList<>();
        try {
            session.beginTransaction();
            Query query = session.createQuery("from Users", Users.class);
            list = query.getResultList();
            session.getTransaction().commit();
            return list;
        } catch (Exception e) {
            return null;
        }

    }

    public boolean saveUser(Users users) {
        try {
            session.beginTransaction();

            session.save(users);
            session.getTransaction().commit();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
