package com.development.securitytestrepo.controller;

import com.development.securitytestrepo.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    private List<Student> students = new ArrayList<>(List.of(
            new Student("John Doe", 20),
            new Student( "Jane Smith", 20),
            new Student("Alice Johnson", 21)
    ));

//    @GetMapping("/csrf-token")
//    public CsrfToken getCsrfToken(HttpServletRequest request) {
//        return (CsrfToken) request.getAttribute(CsrfToken.class.getName());
//    }

    @GetMapping("/hello")
    public String hello(HttpServletRequest request) {
        return "Hello, World! Session ID: " + request.getSession().getId();
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }
}
