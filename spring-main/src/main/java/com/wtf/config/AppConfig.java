package com.wtf.config;

import com.wtf.po.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"com.wtf.service", "com.wtf.po"})
public class AppConfig {
//
//	@Bean("main")
//	@Scope("singleton")
//	public Dog Main1(String a) {
//		return new Dog();
//	}
//	@Bean("main")
//	@Scope("singleton")
//	public Dog Main1() {
//		return new Dog();
//	}
}
