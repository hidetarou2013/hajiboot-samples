package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HajibootApplication {

	/**
	 *
	 * [run]$ mvnw dependency:tree
	 * [run]$ mvnw spring-boot:run
	 * [run]$ mvnw package
	 * [run]$ java -jar target\hajiboot-0.0.1-SNAPSHOT.jar --server.port=8888
	 * [modified][p14]@GetMapping
	 * [modified][p24]spring-boot-devtools
	 * @return
	 */
	@GetMapping("/chap01")
	String home() {
		String ret = "Hello World chap01 with devtools! : ";
		ret += System.getenv("CF_INSTANCE_INDEX");
		return ret;
	}

	public static void main(String[] args) {
		SpringApplication.run(HajibootApplication.class, args);
	}
}
