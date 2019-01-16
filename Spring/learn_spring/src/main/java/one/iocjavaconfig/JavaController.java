package one.iocjavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaController {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService4Java useFunctionService = context.getBean(UseFunctionService4Java.class);
        System.out.println(useFunctionService.SayHello(" Java"));
        context.close();



    }
}
