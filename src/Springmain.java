import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Springmain {
    public static void main(String[] arges)
    {
        //创建一个Spring的IOC容器对象
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        //从IOC容器中获取Bean实例
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        //调用sayHello()方法
        helloWorld.sayHello();
    }
}
