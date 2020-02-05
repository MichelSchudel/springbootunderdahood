package springbootdemo.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExampleConfiguration {

    @Bean
    public ExampleBean exampleBean() {
        return new ExampleBean();
    }
}
