package org.movie.booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableEurekaClient
public class AuditoriumApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuditoriumApplication.class, args);
	}

}
