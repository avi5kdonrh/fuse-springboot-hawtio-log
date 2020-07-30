package com.redhat.fuse.boosters.rest.http;

import io.hawt.log.log4j.Log4jLogQuery;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class Application {

    /**
     * Main method to start the application.
     */
    public static void main(String[] args) {
        SpringApplication. run(Application.class, args);
    }

    @Bean(destroyMethod = "stop", initMethod = "start")
    @Scope("singleton")
    @Lazy(false)
    public Log4jLogQuery log4jLogQuery() {
        Log4jLogQuery log4jLogQuery = new Log4jLogQuery();
        return log4jLogQuery;
    }
}