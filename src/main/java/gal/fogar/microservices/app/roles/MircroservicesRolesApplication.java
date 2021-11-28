package gal.fogar.microservices.app.roles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MircroservicesRolesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MircroservicesRolesApplication.class, args);
	}

}
