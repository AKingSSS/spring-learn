package com.aking.learn.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Service;

/**
 * @author yangkang
 * @date 2022/4/6
 */
@Service
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(final ConfigurableListableBeanFactory beanFactory) throws BeansException {
		final BeanDefinition car = beanFactory.getBeanDefinition("car");
		final MutablePropertyValues pv = car.getPropertyValues();
		pv.addPropertyValue("name","比亚迪");
		car.setScope(BeanDefinition.SCOPE_SINGLETON);
		System.out.println("postProcessBeanFactory 执行");
	}
}
