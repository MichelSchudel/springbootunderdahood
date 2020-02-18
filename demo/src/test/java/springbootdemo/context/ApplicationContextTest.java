package springbootdemo.context;

import static springbootdemo.ContextPrinter.printContext;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextTest {

    @Test
    public void testContext() {
        String basePackage = ApplicationContextTest.class.getPackage().getName();

        ApplicationContext ctx = new AnnotationConfigApplicationContext(basePackage);

        printContext(ctx);

        System.out.println();
        System.out.println("helloBean says " + ctx.getBean(ExampleBean.class).hello());
    }
}
