package com.aking.learn.service;

import org.springframework.stereotype.Service;

/**
 * @author yangkang
 * @date 2022/4/6
 */
@Service
public class BicycleService implements ToolIntf{
	@Override
	public void run() {
		System.out.println("骑自行车");
	}
}
