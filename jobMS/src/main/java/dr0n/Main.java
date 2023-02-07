package dr0n;

import dr0n.config.SpringConfig;
import dr0n.config.WebConfig;
import dr0n.controller.JobController;
import dr0n.service.DefaultJobService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {
    private static ApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println(applicationContext.getBean("jobController", JobController.class));
    }
}
