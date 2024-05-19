package instagram.service.impl;

import instagram.model.User;
import instagram.repository.impl.UserRepositoryImpl;
import instagram.service.UserService;

public class UserServiceImpl  implements UserService {
    UserRepositoryImpl repository=new UserRepositoryImpl();
    public User signup(String username, String pass, String email, long phoneNUmber)
    {
        User user1=new User(username,pass,email,phoneNUmber,"user");
        System.out.println("User Register Successfully");
        repository.save(user1);
        return  user1;
    }
    public User signup(String username,String pass,String email,long phoneNUmber,String role)
    {
        User user1=new User(username,pass,email,phoneNUmber,role);
        System.out.println("User Register Successfully");
        repository.save(user1);
        return  user1;
    }
     public  void  listofUsers()
    {
        repository.save(signup("rahul","123","rahul@gamil.com",123));
        repository.save(signup("aman","124","aman@gamil.com",124));
        repository.save(signup("mohan","123","mohan@gamil.com",125));
        repository.save(signup("shivam","123","shivam@gamil.com",126));
        repository.save(signup("ayush","78","@hh",56));
    }
    public  void listOfAdmin()
    {
        repository.save(signup("gupta","123","rahul@gamil.com",123,"Admin"));
    }

    public void signIn(String username, String password,SuggestionServiceImpl service){


                if((repository.findByNameAndPassword(username,password))!=null)
                {
                    System.out.println("Successufully sign in");
                    System.out.println("Some suggestion for you");
                    service.showSuggestion(username);
                }
                else
                {
                    System.out.println("Invalid ");
                }
    }
    public void updateUserBio(String username,String bio)
    {
            if(repository.setBio(username,bio)!=null){
                System.out.println("Bio updated successfully");
            }
            else{
        System.out.println("Invalid user");}
    }
    @Override
    public User findby(String followerName) {
        return repository.findByName(followerName);
    }

    @Override
    public User verfiyAdmin(String adminName) {
        return repository.verfiyAdmin(adminName);
    }
}
