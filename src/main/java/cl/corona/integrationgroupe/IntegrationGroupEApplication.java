package cl.corona.integrationgroupe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class IntegrationGroupEApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegrationGroupEApplication.class, args);
	}

}
