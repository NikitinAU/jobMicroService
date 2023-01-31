package dr0n;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan
@ComponentScan("dr0n.persistent.repository")
@EnableWebMvc
@RequiredArgsConstructor
@EnableAsync
//@EnableJpaRepositories(basePackages = "dr0n.dr0n.persistent.repository", entityManagerFactoryRef = "emf")
public class Main {
    private static ApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext = new AnnotationConfigApplicationContext(Main.class);
    }
}
