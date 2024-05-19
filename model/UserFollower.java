package instagram.model;

public class UserFollower {
    private  String username;
    private  String followerName;
    public UserFollower(String username,String followerName)
    {
        this.username=username;
        this.followerName=followerName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFollowerName() {
        return followerName;
    }

    public void setFollowerName(String followerName) {
        this.followerName = followerName;
    }
}
