package org.example.springcourse;
import org.springframework.stereotype.Component;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserAdmin user = context.getBean("UserAdmin", UserAdmin.class);
        Translate trans = context.getBean("Translate", Translate.class);
        User normal = context.getBean("GrandUserNormal",User.class);
        trans.run();
        user.UserName();
        normal.UserName();
        context.close();

    }
};