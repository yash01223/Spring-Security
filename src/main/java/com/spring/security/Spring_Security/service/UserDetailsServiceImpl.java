package com.spring.security.Spring_Security.service;

import com.spring.security.Spring_Security.model.User;
import com.spring.security.Spring_Security.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

       User user = userRepo.findByUsername(username);

        if(user ==null){
            throw new UsernameNotFoundException
                    ("User not found with username: " + username);
        }
        return new UserPrincipal(user);
    }
}
