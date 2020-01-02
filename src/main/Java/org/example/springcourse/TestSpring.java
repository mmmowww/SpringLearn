package org.example.springcourse;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args){
/*
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());
        context.close();
        System.out.println("WORK");
*/
/*
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserAdmin user = context.getBean("UserAdmin", UserAdmin.class);
        user.UserName();
        context.close();
        System.out.println("WORK");
*/
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserAdmin user = context.getBean("UserAdmin", UserAdmin.class);
        Translate trans = context.getBean("Translate", Translate.class);
        trans.run();
        user.UserName();

       // UserAdmin Admin = new UserAdmin();
        context.close();
    }
};