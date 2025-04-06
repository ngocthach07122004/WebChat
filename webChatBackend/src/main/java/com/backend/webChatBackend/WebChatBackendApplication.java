package com.backend.webChatBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class WebChatBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebChatBackendApplication.class, args);
	}

}
