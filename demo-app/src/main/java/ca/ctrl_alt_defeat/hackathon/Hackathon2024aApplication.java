package ca.ctrl_alt_defeat.hackathon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
class Hackathon2024aApplication {

	public static void main(String[] args) {
		SpringApplication.run(Hackathon2024aApplication.class, args);
	}
}


