package instagram.service.impl;
import instagram.model.UserFollower;
import instagram.repository.impl.UserFollowerRepositoryImpl;
import instagram.service.UserFollowerService;

import java.util.List;

public class UserFollowerServiceImpl implements UserFollowerService {
    UserFollowerRepositoryImpl userFollowerRepository=new UserFollowerRepositoryImpl();

    @Override
    public UserFollower add(String userName, String followerName,UserServiceImpl userService) {
        if(userService.findby(userName)!=null && userService.findby(followerName)!=null && userFollowerRepository.check(userName,followerName)==null) {
            UserFollower userFollower = new UserFollower(userName, followerName);
            userFollowerRepository.addFollower(userFollower);
            System.out.println("yo");
        return userFollower;
        }
        System.out.println( "no");
        return  null;
    }

    @Override
    public UserFollower findFollower(String userName) {
        List<UserFollower> userFollowerList=userFollowerRepository.dataOfFollower();
        for(UserFollower userFollower: userFollowerList)
        {
            if(userFollower.getUsername().equals(userName))
            {
                System.out.println(userFollower.getFollowerName());
            }
        }
        return null;
    }
    public void PopulateUserFollowerData()
    {
        userFollowerRepository.addFollower(new UserFollower("rahul","ayush"));
        userFollowerRepository.addFollower(new UserFollower("ayush","rahul"));
        userFollowerRepository.addFollower(new UserFollower("rahul","mohan"));
        userFollowerRepository.addFollower(new UserFollower("rahul","shivam"));

    }

    @Override
    public UserFollower findFollowing(String userName) {
        List<UserFollower> userFollowerList=userFollowerRepository.dataOfFollower();
        for(UserFollower userFollower: userFollowerList)
        {
            if(userFollower.getFollowerName().equals(userName))
            {
                System.out.println(userFollower.getUsername());
            }
        }
        return null;
    }
}
