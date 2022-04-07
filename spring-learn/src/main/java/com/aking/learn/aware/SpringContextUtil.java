package com.aking.learn.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author yangkang
 * @date 2022/4/6
 */
@Component
public class SpringContextUtil implements ApplicationContextAware {

	/**
	 * Spring应用上下文环境
	 */
	private static ApplicationContext applicationContext = null;

	/**
	 * 获取对象 这里重写了bean方法，起主要作用
	 *
	 * @param beanId beanId
	 * @return  Object 一个以所给名字注册的bean的实例
	 * @throws BeansException
	 */
	public static Object getBean(final String beanId) throws BeansException {
		return applicationContext.getBean(beanId);
	}

	@Override
	public void setApplicationContext(final ApplicationContext applicationContext) throws BeansException {
		SpringContextUtil.applicationContext = applicationContext;
	}
}
