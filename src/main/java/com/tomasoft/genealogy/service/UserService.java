package com.tomasoft.genealogy.service;

import com.tomasoft.genealogy.dao.UserDao;
import com.tomasoft.genealogy.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("userService")
public class UserService implements UserDetailsService{

    @Autowired
    private UserDao userDao;

    @Transactional(readOnly = true)
    public User findUserByEmail(String email){
        return userDao.findByEmail(email);
    }

    @Transactional
    public void createUser(User user){
        userDao.persist(user);
    }

    @Transactional(readOnly = true)
    public Boolean userExist(String email){
        User user = userDao.findByEmail(email);
        if(user == null){
            return false;
        }
        else {
            return true;
        }
    }

    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userDao.findByEmail(email);
        if(user == null){
            throw new UsernameNotFoundException("User with email address " + email + " does not exist.");
        }
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("USER"));
        return new org.springframework.security.core.userdetails.User(user.getEmail(),user.getPassword(),authorities);
    }
}
