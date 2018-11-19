package org.springtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MonoTestApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MonoTestApplication.class, args);
        context.registerShutdownHook();
    }

}
