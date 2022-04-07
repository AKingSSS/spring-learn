package com.aking.learn.aware;

import com.aking.learn.event.SendMsgEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * @author yangkang
 * @date 2022/4/6
 */
@Component
public class SendMsgAware implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher publisher;

	@Override
	public void setApplicationEventPublisher(final ApplicationEventPublisher applicationEventPublisher) {
		this.publisher = applicationEventPublisher;
	}

	public void register(final String msg, final String phone) throws InterruptedException {
		System.out.println("注册用户中");
		Thread.sleep(300);
		System.out.println("注册完成！");

		final SendMsgEvent sendMsgEvent = new SendMsgEvent(publisher, msg, phone);

		publisher.publishEvent(sendMsgEvent);
	}
}
