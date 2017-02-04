package dao;

import domain.User;
import repository.UserDao;
import repository.UserDaoImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Людмила on 04.02.2017.
 */
public class UserDaoImplTest {
    User user;
    User user1;

    UserDao dao;


    @Test
    public void saveOrUpdateUser() {
        dao = new UserDaoImpl();
        user = new User(1, "Alex87", "Alexander", "Korolev");
        Assert.assertNull(dao.saveOrUpdateUser(user));
        user.setUserName("OtherName");
        Assert.assertEquals(user, dao.saveOrUpdateUser(user));
    }

    @Test
    public void deleteUser() {
        dao = new UserDaoImpl();
        user = new User(2, "Alex37", "Alexander", "Suvorov");
        dao.saveOrUpdateUser(user);
        Assert.assertEquals(user, dao.deleteUser(String.valueOf(user.getId())));
    }

    @Test
    public void getAllUsers() {
        dao = new UserDaoImpl();
        user = new User(1, "Alex37", "Alexander", "Suvorov");
        user1 = new User(2, "Alex57", "Alexander", "Hubanov");
        ArrayList users = new ArrayList();
        users.add(user);
        users.add(user1);
        dao.saveOrUpdateUser(user);
        dao.saveOrUpdateUser(user1);
        Assert.assertEquals(dao.getAllUsers(), users);
    }

    @Test
    public void getUser() {
        dao = new UserDaoImpl();
        user = new User(1, "Alex37", "Alexander", "Suvorov");
        dao.saveOrUpdateUser(user);
        Assert.assertEquals(user, dao.getUser(String.valueOf(user.getId())));

    }

}
