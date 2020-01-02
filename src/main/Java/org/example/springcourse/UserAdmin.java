package org.example.springcourse;

public class UserAdmin implements User  {
  private UserAdmin() {};   // Закрытый контсруктор для того что бы в MAIN нельзя было им пользоваться
  public static UserAdmin getUserAdmin(){   // Фабричный метод для иницыализацыии данного класа
      return new UserAdmin();
  }
    @Override
    public String UserName(){
    // System.out.println(this.Name);
    // return this.Name;
        System.out.println("AdminName");
        return "AdminName";
    }
    public void doMyInit(){
    System.out.println("I'am INIT!!!!!/n");
    }
    public void doMyDestroy(){
        System.out.println("/n I'am DESTROYER!!!");
    }
    public int UserRule(){
       // System.out.println(this.Rule);
       // return this.Rule;
        System.out.println("AdminRule");
        return 1;
    }
}
