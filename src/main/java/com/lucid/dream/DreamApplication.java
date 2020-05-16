package com.lucid.dream;

import com.lucid.dream.utill.FileUploadProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
@EnableConfigurationProperties({
		FileUploadProperties.class
})
public class DreamApplication {

	public static void main(String[] args) {

		SpringApplication.run(DreamApplication.class, args);
	}
}
