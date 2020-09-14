package com.nataraj.lib.runner.asm;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;


abstract public class ApplicationRunner {

    public static void main(String args[]) {
        SpringApplication app = new SpringApplication();
        ConfigurableApplicationContext rootContext = app.run(args);
    }
}
