package com.letsplay.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author gunther
 * @since 11/02/16
 */
@SpringBootApplication
@ComponentScan("com.gvg.backend")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
