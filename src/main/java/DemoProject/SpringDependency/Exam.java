package DemoProject.SpringDependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
  public static void main(String[] args) {
         ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
         Student stu = context.getBean("stu" , Student.class) ;
         stu.display();
         
         Student1 stu1 = context.getBean("s" , Student1.class) ;
         stu1.display1();
         
  }
}
