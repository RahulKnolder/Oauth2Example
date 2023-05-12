package com.oauth.implementation.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OauthSecurityController {
	// This is a controller method that handles GET requests to the "/auth" endpoint
	@GetMapping("/auth")
	public String getRequest(Principal user) {

		// The method takes a Principal object as a parameter, which represents the currently authenticated user
		// The method returns the HTML

		return "welcome";
	}
}



