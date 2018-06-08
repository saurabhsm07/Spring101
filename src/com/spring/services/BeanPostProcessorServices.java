package com.spring.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorServices implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean, String name)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("after initialization - bean post processor : "+name);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String name)
			throws BeansException {
		// TODO Auto-generated method stub
System.out.println("before initialization - bean post processor : "+name);
		return bean;
	}

}
