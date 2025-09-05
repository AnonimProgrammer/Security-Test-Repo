package com.development.securitytestrepo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String hello(HttpServletRequest request) {
        return "Hello, World! Session ID: " + request.getSession().getId();
    }
}
