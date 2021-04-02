package com.task.management.ui_web.config;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

//import com.task.management.ui_web.service.CustomUserDetailService;




class PlainTextPasswordEncoder implements PasswordEncoder {
	
	Logger logger = LogManager.getLogger(PlainTextPasswordEncoder.class);

    @Override
    public String encode(CharSequence charSequence) {
    	String temp= charSequence.toString();
    	logger.info(temp);
        return temp;
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
    	
    	String temp= charSequence.toString();
    	logger.info("Input password: "+temp);
    	logger.info("Storaged password: "+s);
    	//String test="123";
    	// java string do not match with password column with data type character(255) even the value is the same,
    	// change to character varying(1024) is ok but i do not know why
    	//logger.info(test.compareTo(s));
    	//logger.info(temp.compareToIgnoreCase(s));
    	boolean isMatch=temp.equals(s);
    	logger.info(isMatch);
        return isMatch;
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
	
		
		http.authorizeRequests()
		.antMatchers(HttpMethod.GET, "/task/**").authenticated()
        .antMatchers(HttpMethod.POST,"/task/**").authenticated()
        .antMatchers(HttpMethod.GET).permitAll()
        .and()
        .csrf().disable().formLogin().loginPage("/auth/login")
        .loginProcessingUrl("/auth/perform_login").defaultSuccessUrl("/menu/main", true).permitAll();
        
		/*
		http.authorizeRequests()
		.antMatchers(HttpMethod.GET, "/task/**").hasRole("User")
        .antMatchers(HttpMethod.POST,"/task/**").hasRole("User")
        .antMatchers(HttpMethod.GET).permitAll()
        .and()
        .csrf().disable().formLogin();*/
		
		
		/*
		http.authorizeRequests()
		.antMatchers(HttpMethod.GET, "/task/**").authenticated()
        .antMatchers(HttpMethod.POST,"/task/**").authenticated()
        .antMatchers(HttpMethod.GET).permitAll()
        .and()
        .csrf().disable().formLogin();*/
	
    }

}
