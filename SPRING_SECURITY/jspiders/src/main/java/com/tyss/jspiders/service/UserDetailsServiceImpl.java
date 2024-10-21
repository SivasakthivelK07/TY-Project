package com.tyss.jspiders.service;

import com.tyss.jspiders.entity.AppUser;
import com.tyss.jspiders.repository.AppUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private final AppUserRepository appUserRepository;

    // AppUser -> UserDetails
    // Role -> GrantedAuthorities

    // User to communicate with database to fetch the username and password
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // It will return encode password
        AppUser appUser = appUserRepository.findById(username)
                .orElseThrow(() -> new UsernameNotFoundException("There is no user with the provider username"));

//        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
//        for (Role role : appUser.getRoles()) {
//            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
//        }

//        User user = new User(
//                appUser.getUsername(),
//                appUser.getPassword(),
//                appUser.getRoles().stream().map(role ->new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList())
//        );

        return new User(
                appUser.getUsername(),
                appUser.getPassword(),
                appUser.getRoles().stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList())
        );
    }
}
