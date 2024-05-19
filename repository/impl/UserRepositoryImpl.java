package instagram.repository.impl;
import instagram.model.Suggestion;
import instagram.model.User;
import instagram.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    private List<User> listOfuser = new ArrayList<>();
    private List<Suggestion> listOfSuggestion = new ArrayList<>();

    public void save(User user1) {
        listOfuser.add(user1);
    }

    public Suggestion createSuggest(Suggestion suggestion) {
        for (Suggestion suggestion1 : listOfSuggestion) {
            if (suggestion1.getUsername().equals(suggestion.getUsername())) {
                return null;
            }
        }
        listOfSuggestion.add(suggestion);
        return suggestion;

    }

    public User verfiyAdmin(String user) {
        for (User user1 : listOfuser) {
            if (user1.getRole().equals("Admin") && user1.getUserName().equals(user)) {
                return user1;
            }
        }

        return null;
    }


    public User findByName(String username) {
        for (User user : listOfuser) {
            if (user.getUserName().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public User findByNameAndPassword(String username, String password) {
        for (User user : listOfuser) {
            if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    public User setBio(String username, String bio) {
        for (User user : listOfuser) {
            if (user.getUserName().equals(username))
                user.setBio(bio);
            return user;
        }
        return null;
    }
    }

