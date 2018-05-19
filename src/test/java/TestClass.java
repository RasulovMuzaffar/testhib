import model.bean.Roles;
import model.bean.Users;
import model.dao.RoleDao;
import model.dao.RoleDaoImpl;
import model.dao.UserDao;
import model.dao.UserDaoImpl;
import org.junit.Test;

public class TestClass {
    @Test
    public void addUser(){
        UserDao u = new UserDaoImpl();
        u.saveUser(new Users("Ivan", "Ivanov"));
    }

    @Test
    public void allUsers(){
        UserDao u = new UserDaoImpl();
        System.out.println(u.findAll());
    }
    @Test
    public void addRole(){
        RoleDao r = new RoleDaoImpl();
//        r.saveRole(new Roles("admin", new Users("Ivan","Ivanov")));
        r.saveRole(new Roles("manager"));
    }

    @Test
    public void allRoles(){
        RoleDao r = new RoleDaoImpl();
        System.out.println(r.findAll());

    }
}
