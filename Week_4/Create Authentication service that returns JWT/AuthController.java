package com.cognizant.jwt.controller;

import com.cognizant.jwt.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public String authenticate(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");
        if (authHeader == null || !authHeader.startsWith("Basic ")) {
            throw new RuntimeException("Missing or invalid Authorization header.");
        }

        String[] credentials = decodeBasicAuth(authHeader);
        String username = credentials[0];
        String password = credentials[1];

        // Dummy check - replace with real user service
        if ("user".equals(username) && "pwd".equals(password)) {
            String token = jwtUtil.generateToken(username);
            return "{\"token\": \"" + token + "\"}";
        } else {
            throw new RuntimeException("Invalid credentials");
        }
    }

    private String[] decodeBasicAuth(String authHeader) {
        byte[] decodedBytes = Base64.getDecoder().decode(authHeader.substring(6));
        String decoded = new String(decodedBytes);
        return decoded.split(":", 2);
    }
}
