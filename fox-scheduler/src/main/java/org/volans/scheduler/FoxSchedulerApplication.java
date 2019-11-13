package org.volans.scheduler;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableSwagger2Doc
@SpringBootApplication
public class FoxSchedulerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoxSchedulerApplication.class, args);
    }

}
