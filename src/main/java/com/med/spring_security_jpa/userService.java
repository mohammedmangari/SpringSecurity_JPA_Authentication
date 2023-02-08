package com.med.spring_security_jpa;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.med.spring_security_jpa.moduls.user;
import com.med.spring_security_jpa.moduls.myUserDetails;

@Service
public class userService implements UserDetailsService {
	@Autowired
	repo myrepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<user> user =  myrepo.findByUsername(username);
		user.orElseThrow(() -> new UsernameNotFoundException("Not Foun : " + username));
		return user.map(myUserDetails::new).get();
  }
}