package instagram.repository;

import instagram.model.Suggestion;

import java.util.List;

public interface SuggestionRepository {
    Suggestion saveSuggestion(Suggestion suggestion);
    List<Suggestion>  showSuggestion();
}
