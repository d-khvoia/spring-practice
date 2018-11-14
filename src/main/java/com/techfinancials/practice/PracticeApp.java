package com.techfinancials.practice;

import org.apache.naming.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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
