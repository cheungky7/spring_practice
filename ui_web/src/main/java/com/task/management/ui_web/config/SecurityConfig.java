package com.task.management.ui_web.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.task.management.ui_web.controller.TasksController;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	
	
	@Bean 
	public PasswordEncoder passwordEncoder() { 
	    return new BCryptPasswordEncoder(); 
	}
	
	
	 @Override
	 protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
	        // authentication manager (see below)
		 auth.inMemoryAuthentication()
	        .withUser("user1").password(passwordEncoder().encode("user1Pass")).roles("USER")
	        .and()
	        .withUser("user2").password(passwordEncoder().encode("user2Pass")).roles("USER")
	        .and()
	        .withUser("admin").password(passwordEncoder().encode("adminPass")).roles("ADMIN");
	 }
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {
	/*
        http.authorizeRequests()
            .antMatchers(HttpMethod.GET, "/task/**").authenticated()
            .antMatchers(HttpMethod.POST,"/task/**").authenticated()// enter /tasks end point need authenticated
            .antMatchers(HttpMethod.GET).permitAll()
            .anyRequest().authenticated()
            .and()
            .csrf().disable()
            .formLogin().loginPage("/auth/login")
            .loginProcessingUrl("/perform_login")
            .defaultSuccessUrl("/task/list", true)
            .permitAll()
            .and()
            .logout()
            .permitAll();
            */
		
		http.authorizeRequests()
		.antMatchers(HttpMethod.GET, "/task/**").authenticated()
        .antMatchers(HttpMethod.POST,"/task/**").authenticated()
        .antMatchers(HttpMethod.GET).permitAll()
        .and()
        .csrf().disable().formLogin().loginPage("/auth/login")
        .loginProcessingUrl("/auth/perform_login").defaultSuccessUrl("/menu/main", true).permitAll();
         
	
    }

}
