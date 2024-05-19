package instagram.repository.impl;

import instagram.model.Suggestion;
import instagram.repository.SuggestionRepository;
import java.util.ArrayList;
import java.util.List;

public class SuggestionRepositoryImpl implements SuggestionRepository {
    private List<Suggestion> suggestions=new ArrayList<>();
    @Override
    public Suggestion saveSuggestion(Suggestion suggestion) {
        suggestions.add(suggestion);
        return null;
    }

    @Override
    public List<Suggestion> showSuggestion() {
        return suggestions;
    }
}
