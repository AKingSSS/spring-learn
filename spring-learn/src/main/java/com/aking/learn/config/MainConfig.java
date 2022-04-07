package com.aking.learn.config;

import com.aking.learn.pojo.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yangkang
 * @date 2022/4/6
 */
@Configuration
public class MainConfig {
	@Bean(value = "car")
	public Car getCar() {
		System.out.println("car bean 创建");
		return new Car();
	}
}
