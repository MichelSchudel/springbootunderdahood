package springbootdemo.context;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextTest {

    @Test
    public void testContext() {
        String basePackage = ApplicationContextTest.class.getPackage().getName();

        ApplicationContext ctx = new AnnotationConfigApplicationContext(basePackage);

        System.out.println(ctx.getBean(ExampleBean.class).hello());
    }
}
