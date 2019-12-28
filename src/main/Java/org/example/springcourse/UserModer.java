package org.example.springcourse;

public class UserModer implements User  {

    @Override
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
