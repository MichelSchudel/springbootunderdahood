package nl.craftsman.greetingautoconfig;

import nl.greetinglibrary.Greeter;
import nl.greetinglibrary.GreetingConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;

public class GreeterWrapper {

    private static final Logger logger = LoggerFactory.getLogger(GreeterWrapper.class);
    private Greeter greeter;

    public GreeterWrapper(GreetingConfig greetingConfig) {
        this.greeter = new Greeter(greetingConfig);
    }

    @PostConstruct
    public void greet() {
        logger.info(greeter.greet());
    }
}
