package org.example.springcourse;

public class RoleUser {
    private User user;
    public void RoleUser(User user){
      this.user =  user;

    }
    public void SetUserRole(){
        System.out.println("User :" + user.UserName());
    }
}
