package com.oauth.implementation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration

public class SpringSecurityConfig {

    // This is a method that creates a SecurityFilterChain for an OAuth2-secured web application
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        // The method takes an HttpSecurity object as a parameter, which is used to configure the security settings of the web application
        http.authorizeRequests()
                .anyRequest().authenticated() // Require authentication for all requests
                .and()
                .oauth2Login(); // Use OAuth2 for login
        return http.build(); // Build the SecurityFilterChain and return it
    }

}
