package Repository;

import Domain.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Людмила on 04.02.2017.
 */
public class UserDaoImpl implements UserDao {
    Map<String, User> users = new HashMap<String, User>();

    public void setUsers(Map<String, User> users) {
        this.users = users;
    }

    public User saveOrUpdateUser(User user) {
        return users.put(String.valueOf(user.getId()), user);
    }

    public User deleteUser(String id) {
        return users.remove(id);
    }

    public List getAllUsers() {
        return users.values().stream().collect(Collectors.toList());
    }

    public User getUser(String id) {
        return users.get(id);
    }
}
