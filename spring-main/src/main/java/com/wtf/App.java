package com.wtf;

import com.wtf.config.AppConfig;
import com.wtf.po.Cat;
import com.wtf.po.Dog;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		context.register(MainService.class);
//		context.refresh();
//		Main mainService = (Main)context.getBean("main");
//		MainService bean = context.getBean(MainService.class);
//		System.out.println(mainService.getId());
		testXml();
//		testAnnotation();
	}

	public static void testXml() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
//		Dog dog = context.getBean("cat", Dog.class);
		Cat cat = context.getBean("cat", Cat.class);
//		System.out.println(dog.naturalEnemies());
		System.out.println(cat);
		System.out.println(cat.naturalEnemies());
	}

	private static void testAnnotation() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Dog bean = context.getBean(Dog.class);
		System.out.println(bean.hasCall());
	}
}
