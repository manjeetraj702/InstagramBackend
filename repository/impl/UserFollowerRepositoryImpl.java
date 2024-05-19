package instagram.repository.impl;

import instagram.model.UserFollower;
import instagram.repository.UserFollowerRepository;

import java.util.ArrayList;
import java.util.List;

public class UserFollowerRepositoryImpl implements UserFollowerRepository {
    private List<UserFollower> userFollowerList= new ArrayList<>();
    @Override
    public UserFollower addFollower(UserFollower userFollower) {
        userFollowerList.add(userFollower);
        return  userFollower;
    }

    @Override
    public List<UserFollower> dataOfFollower() {
        return userFollowerList;
    }

    @Override
    public UserFollower check(String userName, String followerName) {
        for(UserFollower userFollower:userFollowerList)
        {
            if( userFollower.getUsername().equals(userName)&&userFollower.getFollowerName().equals(followerName))
            {
                return userFollower;
            }
        }
        return null;
    }


}
