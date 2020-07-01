package com.personnel.loginapp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.personnel.loginapp"})
public class LogInAppConfig {

	@Bean
	public InternalResourceViewResolver viewResolver()
	{
		InternalResourceViewResolver irv = new InternalResourceViewResolver();
		irv.setSuffix(".jsp");
		return irv;
	}
}
