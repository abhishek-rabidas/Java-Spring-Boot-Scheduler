package com.github.viiiraj07.JavaScheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class JavaSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSchedulerApplication.class, args);
	}

}
