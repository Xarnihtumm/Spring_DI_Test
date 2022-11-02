package com.hostmdy.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor{
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		if(bean instanceof BeanLifeCycleTest) {
			((BeanLifeCycleTest) bean).beforeInitialize();
		}
		
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		if(bean instanceof BeanLifeCycleTest) {
			((BeanLifeCycleTest) bean).afterInitialize();
		}
		
		return bean;
	}
	
}
