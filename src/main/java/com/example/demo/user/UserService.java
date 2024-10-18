package com.example.demo.user;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String getUser() {
        return "Hello World";
    }
}
