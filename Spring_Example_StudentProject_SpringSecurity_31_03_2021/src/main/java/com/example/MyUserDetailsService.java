package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@Service
public class MyUserDetailsService implements UserDetailsService {
	@Autowired
private UserRepository repo;
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		Person_table pt=repo.findByUsername(email);
		if( pt==null)
			throw new UsernameNotFoundException("user 404");
		
		return new UserPrinciple(pt);
	}

}
