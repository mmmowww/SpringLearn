package org.example.springcourse;
import org.example.springcourse.User; // ?
public class UserRegistration implements User {

    private User user;
    private UserAdmin admin;
    private UserModer moder;
    private UserNormal normal;

    public String UserName;
    public int UserRule;
    public UserRegistration(String name, int rul){
   this.UserName = name;
   this.UserRule = rul;
    }
    public void RegistrationNormal(UserNormal normal){
        this.normal = normal;
    }
    public void RegistrationAdmin(UserAdmin admin){
        this.admin = admin;
    }
    public void RegistrationModer(UserModer moder){
        this.moder = moder;
    }

    public void RegUser(){
        System.out.println("Регистрацыя пользователя: " + user.UserName() + user.UserRule() );
    }
    public void RegAdmin(){
        System.out.println("Регистрацыя пользователя: " + admin.UserName() + admin.UserRule() );
    }
    public void RegModer(){
        System.out.println("Регистрацыя пользователя: " + moder.UserName() + moder.UserRule() );
    }
    public void RegNormal(){
        System.out.println("Регистрацыя пользователя: " + normal.UserName() + normal.UserRule() );
    }
}
