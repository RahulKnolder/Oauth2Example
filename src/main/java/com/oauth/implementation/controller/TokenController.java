package com.oauth.implementation.controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

// This annotation marks this class as a Restful controller
@RestController
public class TokenController {

    // This is a controller method that handles GET requests to the "/token" endpoint
    // When a GET request is received at "/token", this method will be executed
    @GetMapping("/token")
    public Map<String, Object> currentUser(OAuth2AuthenticationToken oAuth2AuthenticationToken){
        // This line retrieves the current user's attributes from the OAuth2 authentication token
        // The attributes are returned as a map of key-value pairs
        return oAuth2AuthenticationToken.getPrincipal().getAttributes();
    }
}
