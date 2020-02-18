package springbootdemo;

import static springbootdemo.ContextPrinter.printContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootdemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringbootdemoApplication.class, args);
		//printContext(ctx);
	}

}
