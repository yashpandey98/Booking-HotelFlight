package com.nagarro.appnagp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@ComponentScan({ "com.nagarro" })
@EntityScan("com.nagarro.model")
//@EnableJpaRepositories("com.nagarro.dao")
@CrossOrigin(origins = "http://localhost:6200")
public class NagpApplication {

	public static void main(String[] args) {
		SpringApplication.run(NagpApplication.class, args);
	}

}
