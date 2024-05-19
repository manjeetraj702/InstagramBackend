package instagram.service;

import instagram.model.User;
import instagram.model.UserFollower;
import instagram.service.impl.UserServiceImpl;

public interface UserFollowerService {
    UserFollower add(String userName, String followerName, UserServiceImpl userService);
    UserFollower findFollower(String userName);
    UserFollower findFollowing(String userName);
}
