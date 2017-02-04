package service;

import domain.User;
import repository.UserDao;
import repository.UserDaoImpl;

import java.util.List;

/**
 * Created by Людмила on 04.02.2017.
 */
public class UserServiceImpl implements UserService {
    UserDao uDao = new UserDaoImpl();

    public User saveOrUpdateUser(User user) {
        if (null != user) {
            return uDao.saveOrUpdateUser(user);
        } else {
            return null;
        }

    }

    public User deleteUser(String id) {
        return uDao.deleteUser(id);
    }

    public List<User> getAllUsers() {
        return uDao.getAllUsers();
    }

    public User getUser(String id) {
        return uDao.getUser(id);
    }
}
