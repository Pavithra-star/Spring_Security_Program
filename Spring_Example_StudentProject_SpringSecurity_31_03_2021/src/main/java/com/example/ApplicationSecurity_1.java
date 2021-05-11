package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
@Configuration
@EnableWebSecurity
public class ApplicationSecurity_1  extends WebSecurityConfigurerAdapter{

	@Autowired
	private UserDetailsService userDetailsService;

		//its calss name AuthenticationProvider
		@Bean
		public AuthenticationProvider authProvider() {
			//if u want the data u have to add the DAO data access object
			DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
			//Controller talks with service talks with database(dao)
			provider.setUserDetailsService(userDetailsService);
			provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
			return provider;
			
		}
}
