package com.aking.learn;

import com.aking.learn.aware.SendMsgAware;
import com.aking.learn.aware.SpringContextUtil;
import com.aking.learn.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yangkang
 * @date 2022/4/6
 */
public class Application {

	@Test
	public void test() {
		// 按包扫描注入bean
		final ApplicationContext context = new AnnotationConfigApplicationContext("com.aking.learn");
		final UserService userService = context.getBean("userService", UserService.class);
		userService.say();
		userService.run();
		userService.teach();
	}

	@Test
	public void testAware() {
		// 按包扫描注入bean, 将 SpringContextUtil注入bean
		final ApplicationContext context = new AnnotationConfigApplicationContext("com.aking.learn");
		final SpringContextUtil contextUtil = (SpringContextUtil)SpringContextUtil.getBean("springContextUtil");
		final UserService userService = (UserService)SpringContextUtil.getBean("userService");
		userService.run();
	}

	@Test
	public void testListenerAware() throws InterruptedException {
		// 按包扫描注入bean, 将 SpringContextUtil注入bean
		final ApplicationContext context = new AnnotationConfigApplicationContext("com.aking.learn");
		final SendMsgAware sendMsgAware = (SendMsgAware)SpringContextUtil.getBean("sendMsgAware");
		sendMsgAware.register("恭喜你，中了一等奖！", "18800000001");
	}
}

