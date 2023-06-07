package com.Unikey.Navipinprac.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

@RestController
public class UserController {

    @GetMapping
    public String welcome() {
        return "Welcome to Mercedes-Benz";
    }

    @GetMapping("/")
    public String home(String home) {
        String abc=" Welcome to MBRDI ";
        return abc;
    }
    @GetMapping("/userDetails")
    public Principal user(Principal principal) {
        System.out.println("User Name : " + principal.getName());
        return principal;
    }

    @GetMapping("/api/mb")
    public ResponseEntity<String> sayHello() {
        LocalDate Date= LocalDate.now();
        LocalTime Time=LocalTime.now();
        return ResponseEntity.ok(" Welcome to the Mercedes-Benz "+"         " +
                ", Date = [ "+ Date +" ]"+" Time = [ "+ Time +" ]");
    }
}