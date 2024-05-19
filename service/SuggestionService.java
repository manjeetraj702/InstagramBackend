package instagram.service;

import instagram.service.impl.UserServiceImpl;

public interface SuggestionService {
    String createSuggest(String userName, String photoUrl, String adminName, UserServiceImpl userService);
    void showSuggestion(String userName);

    void data();
}
