package instagram.repository;

import instagram.model.UserFollower;

import java.util.List;

public interface UserFollowerRepository {
    UserFollower addFollower(UserFollower userFollower);
    List<UserFollower> dataOfFollower();

    UserFollower check(String userName, String followerName);
}
