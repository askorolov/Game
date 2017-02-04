package Repository;

import Domain.User;

import java.util.List;

/**
 * Created by Людмила on 04.02.2017.
 */
public interface UserDao {
    User saveOrUpdateUser(User user);

    User deleteUser(String id);

    List<User> getAllUsers();

    User getUser(String id);


}
