package instagram.service;


import instagram.model.User;
import instagram.model.UserFollower;
import instagram.service.impl.SuggestionServiceImpl;

public interface UserService {
    User signup(String username, String pass, String email, long phoneNUmber);
    void signIn(String username, String password, SuggestionServiceImpl service);
    void updateUserBio(String username,String bio);

    User findby(String userName);

    User verfiyAdmin(String adminName);
}
