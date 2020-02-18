package springbootdemo;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;

public final class ContextPrinter {

    public static final void printContext(ApplicationContext ctx) {
        System.out.println("Configured Spring beans");
        System.out.println("-----------------------");
        Arrays.stream(ctx.getBeanDefinitionNames()).forEach(beanName -> System.out.println(beanName));
    }
}
