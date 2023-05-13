package com.oauth.implementation.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// This annotation marks this class as a RESTful controller
@RestController
public class OauthSecurityController {

    // This is a controller method that handles GET requests to the "/auth" endpoint
    // When a GET request is received at "/auth", this method will be executed
    @GetMapping("/auth")
    public String getRequest() {
        // This method simply returns the string "Endpoint verified"
        // This is the response that will be sent back to the client that made the request
        return "Endpoint verified";
    }
}



