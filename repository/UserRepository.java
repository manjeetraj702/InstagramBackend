package instagram.repository;

import instagram.model.User;

public interface UserRepository {
     void save(User user1);
    User findByName(String username);
    User findByNameAndPassword(String username, String password);
    User setBio(String username, String bio);
     User verfiyAdmin(String user);
}
