package fr.epsi.b32324c1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


@SpringBootApplication
@EntityScan(basePackages = "fr.epsi.b32324c1.entity")
@EnableJpaRepositories(basePackages = "fr.epsi.b32324c1.repository")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
