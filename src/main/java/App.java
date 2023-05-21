import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        ApplicationContext applicationContext1 =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());

        ApplicationContext applicationContext2 =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Cat bean2 =
                (Cat) applicationContext.getBean("cat");

        ApplicationContext applicationContext3 =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Cat bean3 =
                (Cat) applicationContext.getBean("cat");

        boolean isEqualHelloWorld = bean.equals(bean1);
        System.out.println("Equal: " + isEqualHelloWorld);

        boolean isEqualCat = bean2.equals(bean3);
        System.out.println("Equal: " + isEqualCat);
    }
}