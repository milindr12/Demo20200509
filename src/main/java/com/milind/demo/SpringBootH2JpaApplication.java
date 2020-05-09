package com.milind.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.milind.model")
@EnableJpaRepositories("com.milind.dao")
public class SpringBootH2JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootH2JpaApplication.class, args);
	}

}
