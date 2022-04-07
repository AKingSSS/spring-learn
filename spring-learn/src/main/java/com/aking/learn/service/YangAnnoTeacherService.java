package com.aking.learn.service;

import org.springframework.stereotype.Service;

/**
 * @author yangkang
 * @date 2022/4/6
 */
@Service
public class YangAnnoTeacherService {

	/**
	 * 教
	 *
	 * @param object 对象
	 */
	public void teach(final String object) {
		System.out.println("我是教" + object);
	}

}
