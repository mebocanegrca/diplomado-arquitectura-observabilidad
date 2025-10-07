package co.edu.unisabana.group1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AppWsApplication {
    public static void main(String[] args) {
        SpringApplication.run(AppWsApplication.class, args);
    }
}