package com.masai.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfiguration {
	@Bean // is used to indicate that method that we are initialized configures an new object to be mana
	//by Spring object IOC 	containers
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}


}