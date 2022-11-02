package com.hostmdy.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.hostmdy.basic.controller.ConstructorInjectedController;
import com.hostmdy.basic.controller.ContextController;
import com.hostmdy.basic.controller.I18nController;
import com.hostmdy.basic.controller.PetController;
import com.hostmdy.basic.controller.PropertyInjectedController;
import com.hostmdy.basic.controller.SetterInjectedController;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@ComponentScan(
		{"com.hostmdy.service",
			"com.hostmdy.basic.controller",
			"com.hostmdy.basic.config","com.hostmdy.basic.repository"})
@Slf4j
public class SpringDiTestApplication {
	public static void main(String[] args) {
		log.info("Custom Log : SpringDiTest Main Application is started");
		ApplicationContext context = SpringApplication.run(SpringDiTestApplication.class, args);
		ContextController contextController = (ContextController) context.getBean("contextController");
		System.out.println(contextController.getContextValue());
		
		PropertyInjectedController propertyInjectedBean = 
				context.getBean(PropertyInjectedController.class);
		
		SetterInjectedController setterInjectedBean =
				context.getBean(SetterInjectedController.class);
		
		ConstructorInjectedController constructorInjectedBean = 
				context.getBean(ConstructorInjectedController.class);
		
		System.out.println("PropertyInjected : "+propertyInjectedBean.sayHello());
		System.out.println("SetterInjected : "+setterInjectedBean.sayHello());
		System.out.println("ConstructorInjected : "+constructorInjectedBean.sayHello());
		
//		I18nController i18nBean = context.getBean("i18nController",I18nController.class);
//		System.out.println("I18N Bean : "+i18nBean.sayHello());
		
		PetController petBean = context.getBean(PetController.class);
		System.out.println("petBean : "+petBean.getPetType());
		
	}

}
