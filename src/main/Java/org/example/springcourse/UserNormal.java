package org.example.springcourse;
import org.springframework.stereotype.Component;
@Component("GrandUserNormal")
public class UserNormal implements User  {

    @Override
    public String UserName(){
       // System.out.println(this.Name);
       // return this.Name;
        System.out.println("UserName");
        return "UserName";
    }
    public int UserRule(){
    //    System.out.println(this.Rule);
    //    return this.Rule;
        System.out.println("RuleUserName");
        return 3;
    }
}
