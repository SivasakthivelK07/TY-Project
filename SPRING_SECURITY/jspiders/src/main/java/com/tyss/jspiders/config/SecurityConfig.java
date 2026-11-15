package com.tyss.jspiders.config;

import com.tyss.jspiders.filter.SecurityFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@RequiredArgsConstructor
// @EnableWebSecurity to spring this class my security configuration class
@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private final UserDetailsService userDetailsService;
    private final PasswordEncoder passwordEncoder;
    private final SecurityFilter securityFilter;

    private final String EMPLOYEE = "EMPLOYEE";
    private final String TRAINER = "TRAINER";
    private final String STUDENT = "STUDENT";
    private final String ADMIN = "ADMIN";

    @Bean
    @Override
    protected AuthenticationManager authenticationManager() throws Exception {
        return super.authenticationManager();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.authorizeHttpRequests().antMatchers("/api/employee/**").hasAnyRole(EMPLOYEE, ADMIN);
        http.authorizeHttpRequests().antMatchers("/api/student/**").hasAnyRole(STUDENT);
        http.authorizeHttpRequests().antMatchers("/api/trainer/**").hasAnyRole(TRAINER);
        http.authorizeHttpRequests().antMatchers("/auth/**").permitAll().anyRequest().authenticated();
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        http.addFilterBefore(securityFilter, UsernamePasswordAuthenticationFilter.class);
    }

}
