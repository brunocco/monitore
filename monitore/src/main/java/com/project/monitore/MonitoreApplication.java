package com.project.monitore;

import javax.persistence.Entity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan(basePackages="com.project.monitore.entity")
@ComponentScan(basePackages={"com.*"})
@EnableJpaRepositories(basePackages="com.project.monitore.repository")
@EnableTransactionManagement
public class MonitoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonitoreApplication.class, args);
	}

}
