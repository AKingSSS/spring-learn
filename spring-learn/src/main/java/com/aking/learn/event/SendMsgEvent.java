package com.aking.learn.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author yangkang
 * @date 2022/4/6
 */
public class SendMsgEvent extends ApplicationEvent {
	private final String msg;
	private final String phone;

	/**
	 * Create a new ApplicationEvent.
	 *
	 * @param source the object on which the event initially occurred (never {@code null})
	 */
	public SendMsgEvent(final Object source, final String msg, final String phone) {
		super(source);
		this.msg = msg;
		this.phone = phone;
	}

	public String getMsg() {
		return msg;
	}

	public String getPhone() {
		return phone;
	}
}
