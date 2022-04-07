package com.aking.learn.service;

import org.springframework.stereotype.Service;

/**
 * @author yangkang
 * @date 2022/4/6
 */
@Service
public class PlanService implements ToolIntf{
	@Override
	public void run() {
		System.out.println("开飞机");
	}
}
