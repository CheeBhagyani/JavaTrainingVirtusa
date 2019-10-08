package chee.project.springdatajpaems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
@EntityScan(basePackages = "chee.rentcloud.ems.model")
public class SpringdataJpaEmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdataJpaEmsApplication.class, args);
	}

}
