package springbootdemo.autoconfig;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackages;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@EnableAutoConfiguration
public class AutoConfigurationPackagesTest {

    public static void main (String[] args) {

        SpringApplication app =
                new SpringApplication(AutoConfigurationPackagesTest.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.setLogStartupInfo(false);
        ConfigurableApplicationContext c = app.run(args);
        List<String> packages = AutoConfigurationPackages.get(c);
        System.out.println("packages: "+packages);
    }
}