package org.example.springcourse;

public class UserAdmin implements User  {

    @Override
    public String UserName(){
    // System.out.println(this.Name);
    // return this.Name;
        System.out.println("AdminName");
        return "AdminName";
    }
    public int UserRule(){
       // System.out.println(this.Rule);
       // return this.Rule;
        System.out.println("AdminRule");
        return 1;
    }
}
