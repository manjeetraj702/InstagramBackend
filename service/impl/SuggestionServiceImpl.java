package instagram.service.impl;

import instagram.model.Suggestion;
import instagram.repository.impl.SuggestionRepositoryImpl;
import instagram.service.SuggestionService;

import java.util.List;

public class SuggestionServiceImpl implements SuggestionService {
    SuggestionRepositoryImpl suggestionRepository=new SuggestionRepositoryImpl();
    @Override
    public String createSuggest(String userName, String photoUrl, String adminName, UserServiceImpl userService) {
        if(userService.verfiyAdmin(adminName)!=null)
        {
            if(userService.findby(userName)==null)
            {
                userService.signup(userName,"97","@jj",67);
            }
            for(Suggestion suggestion1:suggestionRepository.showSuggestion())
            {
                if(suggestion1.getUsername().equals(userName))
                {
                    return "Suggestion already exist";
                }
            }
            Suggestion suggestion1=new Suggestion(userName,photoUrl);
            suggestionRepository.saveSuggestion(suggestion1);
            return  "Suggestion created";
        }
        return "You are not admin";
    }

    @Override
    public void showSuggestion(String username) {
        for(Suggestion suggestion:suggestionRepository.showSuggestion())
        {
            if(suggestion.getUsername()!=username) {
                System.out.println(suggestion.getUsername());
            }
        }
    }

    @Override
    public void data() {
        suggestionRepository.saveSuggestion(new Suggestion("rahul","45"));
        suggestionRepository.saveSuggestion(new Suggestion("ayush","12"));
    }
}
