package instagram.model;

public class Suggestion {
    private String username;
    private String profilePhotoUrl;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProfilePhotoUrl() {
        return profilePhotoUrl;
    }

    public void setProfilePhotoUrl(String profilePhotoUrl) {
        this.profilePhotoUrl = profilePhotoUrl;
    }

    public Suggestion(String username, String profilePhotoUrl) {
        this.username = username;
        this.profilePhotoUrl = profilePhotoUrl;
    }
}
