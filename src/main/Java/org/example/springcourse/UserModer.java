package org.example.springcourse;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

public class UserModer implements User  {
    private UserNormal normal;
    @Autowired
    public UserModer(UserNormal normal){
    this.normal = normal;
    }

    public String UserName(){
      //  System.out.println(this.Name);
      //  return this.Name;
        System.out.println("ModerName");
        return "ModerName";
    }
    public int UserRule(){
      //  System.out.println(this.Rule);
      //  return this.Rule;
        System.out.println("ModerRule");
        return 2;
    }
}
