package org.example.springcourse;

public class UserNormal implements User  {
    public int Rule;
    public String Name;
    public UserNormal(int rule, String name){
        this.Rule = rule;
        this.Name = name;
    }
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
