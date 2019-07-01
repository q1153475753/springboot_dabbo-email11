package com.qf.logonweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qf.logonweb.controller")
public class LogonWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogonWebApplication.class, args);
    }

}
