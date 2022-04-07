package com.aking.learn.listener;

import com.aking.learn.event.SendMsgEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author yangkang
 * @date 2022/4/6
 */
@Component
public class SendMessageListener implements ApplicationListener<SendMsgEvent> {
	/**
	 * Handle an application event.
	 *
	 * @param event the event to respond to
	 */
	@Override
	public void onApplicationEvent(final SendMsgEvent event) {
		try {
			System.out.println("开始向手机"+event.getPhone()+"发送短信，短信内容为："+event.getMsg());
			Thread.sleep(1000);
			System.out.println("发送短信成功！");
		} catch (final InterruptedException e) {
			e.printStackTrace();
		}
	}
}
