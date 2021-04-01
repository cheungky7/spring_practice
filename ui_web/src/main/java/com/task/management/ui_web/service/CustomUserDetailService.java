package com.task.management.ui_web.service;

import java.util.HashSet;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.task.management.ui_web.dao.TypeHandler.LocalDateTimeTypeHandler;
import com.task.management.ui_web.dao.mapper.UserMapper;

@Service
public class CustomUserDetailService implements UserDetailsService {
	
	Logger logger = LogManager.getLogger(CustomUserDetailService.class);
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		logger.info(username);
		com.task.management.ui_web.model.User user=userMapper.getUserByUsername(username);
		
		 Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
		 
		 grantedAuthorities.add(new SimpleGrantedAuthority("User"));
		
		// UserDetails returnUser = new User(user.getUsername(), user.getPassword(), true, true, true, true, new GrantedAuthority[]{ new GrantedAuthorityImpl("ROLE_USER") });
		 UserDetails returnUser = new User(user.getUsername(), user.getPassword(), grantedAuthorities);
		 
		 logger.info(returnUser);
		 
		return returnUser;
	}

}
