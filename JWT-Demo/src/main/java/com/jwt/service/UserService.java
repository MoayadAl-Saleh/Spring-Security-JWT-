package com.jwt.service;

import com.jwt.entity.UserStore;
import com.jwt.repo.RepoUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class UserService implements UserDetailsService
{
    private final RepoUser repoUser;

    public UserService (RepoUser repoUser)
    {
        this.repoUser = repoUser;
    }

    @Override
    public UserDetails loadUserByUsername (String userName) throws UsernameNotFoundException
    {
        //Logic to get the user form the Database
        UserStore userStore = repoUser.findByUsername(userName);
        if (userStore == null)
        {
            throw new UsernameNotFoundException("User not found");
        }
        return new User(userStore.getUsername(), userStore.getPassword(), getAuthorities(userStore));
    }

    private List<GrantedAuthority> getAuthorities (UserStore userStore)
    {
        List<GrantedAuthority> authorities = new ArrayList<>();

        if (!userStore.getRoles().isEmpty())
        {
            userStore.getRoles().forEach(role ->
            {
                authorities.add(new SimpleGrantedAuthority(role.getName()));
            });
        }
        return authorities;
    }
}
