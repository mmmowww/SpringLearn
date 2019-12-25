package org.example.springcourse;

public class UserModer implements User  {
    public int Rule;
    public String Name;
    public UserModer(int rule, String name){
        this.Rule = rule;
        this.Name = name;
    }
    @Override
    public String UserName(){
        System.out.println(this.Name);
        return this.Name;
    }
    public int UserRule(){
        System.out.println(this.Rule);
        return this.Rule;
    }
}
