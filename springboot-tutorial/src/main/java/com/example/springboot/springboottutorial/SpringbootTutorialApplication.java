package com.example.springboot.springboottutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootTutorialApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(SpringbootTutorialApplication.class, args);
		for (String name : applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
			
		}
		
	}
}

