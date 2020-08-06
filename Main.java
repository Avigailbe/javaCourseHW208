package home_work208;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //takes most time as gets all objects in package but only happens once at startup
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ClockConf.class);
        //gets all classes with @Service or @Component in the home_work208 package
        ClockService clockService = context.getBean(ClockService.class);
        clockService.useClocks();

    }
}
