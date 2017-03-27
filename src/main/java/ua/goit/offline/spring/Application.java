package ua.goit.offline.spring;

import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
//          Checker checker = context.getBean("checker");
            Checker checker = context.getBean(Checker.class);
            Assert.assertTrue(checker.check("Y"));
            Assert.assertTrue(checker.check("X"));
            Assert.assertTrue(checker.check("abc"));
            Assert.assertTrue(checker.check("cde"));
            Assert.assertTrue(checker.check("Z"));
            Assert.assertTrue(checker.check("O"));
    }
}
