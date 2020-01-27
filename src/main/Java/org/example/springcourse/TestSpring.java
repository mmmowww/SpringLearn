package org.example.springcourse;
import org.springframework.stereotype.Component;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
/// Роль в этой связки что в JavaSpring будут хрониться как пороли так и логи для общения между платформами
@SpringBootApplication
public class TestSpring {
    public static void main(String[] args){
/* Это к Курсочу дела не имеет (Это отдельная учёба которая идёт в паралели, когда на неё у меня время находиться)
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserAdmin user = context.getBean("UserAdmin", UserAdmin.class);
        Translate trans = context.getBean("Translate", Translate.class);
        User normal = context.getBean("GrandUserNormal",User.class);
        trans.run();
        user.UserName();
        normal.UserName();
        context.close();

*/
 SpringApplication.run(TestSpring.class, args); // Само парсирование класса
};
};