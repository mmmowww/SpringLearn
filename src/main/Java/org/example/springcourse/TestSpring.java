package org.example.springcourse;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpring {
    public static void main(String[] args){
        //////////
        /*
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());
        context.close();
        System.out.println("WORK");

        /////////////////////////
         */
        ClassPathXmlApplicationContext contex = new ClassPathXmlApplicationContext("applicationContext.xml");
        RoleUser user = context.getBean("RoleUser", RoleUser.class); //ER: Error:(18, 25) java: cannot find symbol symbol:   variable context location: class org.example.springcourse.TestSpring
        System.out.println(user.GetUserRole()); //ER : Error:(19, 32) java: method GetUserRole in class org.example.springcourse.RoleUser cannot be applied to given types; required: org.example.springcourse.User  found: no arguments  reason: actual and formal argument lists differ in length
        context.close();  //ER:Error:(20, 9) java: cannot find symbol symbol:   variable context  location: class org.example.springcourse.TestSpring
        System.out.println("WORK");
    }
}