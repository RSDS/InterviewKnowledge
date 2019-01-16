package one.iocannotationconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TController {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.SayHello(" Annotation"));
        context.close();



    }
}
