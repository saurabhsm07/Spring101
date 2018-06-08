package com.spring.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BeanFactoryPostProcessorServices implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory context)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("bean factory or Application context is initialised");
	}

}
