package com.project.monitore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/*@EntityScan(basePackages="com.project.monitore.entity")
@ComponentScan(basePackages={"com.*"})
@EnableJpaRepositories(basePackages="com.project.monitore.repository")
@EnableTransactionManagement*/
@SpringBootApplication
public class MonitoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonitoreApplication.class, args);
	}

}
