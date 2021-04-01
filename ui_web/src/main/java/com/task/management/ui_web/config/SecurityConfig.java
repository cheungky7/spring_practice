package com.task.management.ui_web.config;

import javax.annotation.Resource;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


class PlainTextPasswordEncoder implements PasswordEncoder {

    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(charSequence.toString());
    }
}



@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Resource
    private UserDetailsService userDetailsService;
	
	/*
	
	@Bean 
	public PasswordEncoder passwordEncoder() { 
	    return new BCryptPasswordEncoder(); 
	}*/
	
	public PasswordEncoder passwordEncoder() {
		return new PlainTextPasswordEncoder();
	}
	
	
	@Bean
    public DaoAuthenticationProvider authProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService);
        authProvider.setPasswordEncoder(passwordEncoder());
        return authProvider;
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
		.antMatchers(HttpMethod.GET, "/task/**").hasRole("User")
        .antMatchers(HttpMethod.POST,"/task/**").hasRole("User")
        .antMatchers(HttpMethod.GET).permitAll()
        .and()
        .csrf().disable().formLogin().loginPage("/auth/login")
        .loginProcessingUrl("/auth/perform_login").defaultSuccessUrl("/menu/main", true).permitAll();
         
	
    }

}
