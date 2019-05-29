package com.ioclearningspring.shazly;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.ioclearningspring.shazly")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	//define a bean for our sad fortune service 
	// the below function name is considered the "bean id"
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	
	// define a bean for our swim coach AND inject Dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService()); 
		// it calls the method on line 13 to inject sadFortuneService into 
		// SwimCoach bean
	}
}
