package com.aking.learn.service;

import com.aking.learn.annotation.Yang;
import com.aking.learn.pojo.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yangkang
 * @date 2022/4/6
 */
@Service
public class UserService {
	@Autowired
	private Car car;
	@Resource(name = "planService")
	private ToolIntf toolIntf;
	@Yang
	private YangAnnoTeacherService yangAnnoTeacherService;

	public void say() {
		System.out.println("我要买" + car.getName());
	}

	public void run() {
		toolIntf.run();
	}

	public void teach() {
		yangAnnoTeacherService.teach("语文");
	}
}
