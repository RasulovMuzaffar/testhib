import model.bean.Role;
import model.bean.User;
import model.config.HibernateUtil;
import model.dao.RoleDao;
import model.dao.RoleDaoImpl;
import model.dao.UserDao;
import model.dao.UserDaoImpl;
import org.hibernate.Session;
import org.junit.Test;

public class TestClass {
    @Test
    public void addUser(){
        UserDao u = new UserDaoImpl();
        u.saveUser(new User("Ivan", "Ivanov"));
    }

    @Test
    public void allUsers(){
        UserDao u = new UserDaoImpl();
        System.out.println(u.findAll());
    }
    @Test
    public void addRole(){
        RoleDao r = new RoleDaoImpl();
//        r.saveRole(new Role("admin", new User("Ivan","Ivanov")));
    }

    @Test
    public void allRoles(){
        RoleDao r = new RoleDaoImpl();
        System.out.println(r.findAll());

    }
}
