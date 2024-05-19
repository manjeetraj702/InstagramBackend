package instagram;

import instagram.controller.Controller;

public class ListOfUser {
    public static void main(String[] args) {
        Controller controller=new Controller();
        controller.data();
        controller.userFollowerData();
        controller.suggestiomData();
        controller.admindata();
        System.out.println(" start ");
        System.out.println(controller.createSuggest("shivam","hff","gupta"));
//        controller.signIn("rahul","123");
//        controller.signup("sk","sk@123","@gmail",6789);
//        controller.signIn("sk","sk@123");
//        controller.addFollower("ayush","mohan");
//        controller.addFollower("ayush","shivam");
//        controller.findFollower("rahul");
        controller.findFollower("ayush");

    }
}

