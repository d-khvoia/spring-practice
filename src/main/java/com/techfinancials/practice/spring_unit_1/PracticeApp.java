package com.techfinancials.practice.spring_unit_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
public class PracticeApp {

	public static void main(String[] args) {
		SpringApplication.run(PracticeApp.class, args);

        ApplicationContext context = new FileSystemXmlApplicationContext("spring.xml");

        Kitten kitten = (Kitten) context.getBean("kitten");
        kitten.makeSound();
        System.out.println(kitten.toString() + "\n");

        Child child = (Child) context.getBean("cld");
        System.out.println(child.toString());
	}
}
