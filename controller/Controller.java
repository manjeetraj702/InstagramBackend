package instagram.controller;


import instagram.model.UserFollower;
import instagram.service.impl.SuggestionServiceImpl;
import instagram.service.impl.UserFollowerServiceImpl;
import instagram.service.impl.UserServiceImpl;
import instagram.model.User;

public class Controller {
    UserServiceImpl userService=new UserServiceImpl();
    UserFollowerServiceImpl userFollowerService=new UserFollowerServiceImpl();
    SuggestionServiceImpl suggestion=new SuggestionServiceImpl();
    public String createSuggest(String userName, String photoUrl, String adminName){
        return suggestion.createSuggest(userName,photoUrl,adminName,userService);

    }
    public  void findFollower(String userName)
    {
        userFollowerService.findFollower(userName);
    }
    public UserFollower addFollower(String userName, String followerName)
    {
        return userFollowerService.add(userName,followerName,userService);
    }
    public  void findFollowing(String userName)
    {
        userFollowerService.findFollowing(userName);
    }
    public void userFollowerData()
    {
        userFollowerService.PopulateUserFollowerData();
    }


    public User signup(String username, String pass, String email, long phoneNUmber)
    {
        return  userService.signup(username,pass,email,phoneNUmber);
    }
    public  void signIn(String username, String password){

        userService.signIn(username,password,suggestion);
    }

    public void updateUserBio(String username,String bio)
    {


          userService.updateUserBio(username,bio);
    }

    public void data() {
        userService.listofUsers();
    }

    public void admindata() {
        userService.listOfAdmin();
    }
    public void suggestiomData() {
        suggestion.data();
    }



}
