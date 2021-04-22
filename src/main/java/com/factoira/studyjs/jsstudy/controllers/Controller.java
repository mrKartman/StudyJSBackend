package com.factoira.studyjs.jsstudy.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@RestController
public class Controller {

    @PostMapping(path = "/")
    public ResponseEntity<String> post(HttpServletRequest request) throws ServletException, InterruptedException {
        System.out.println("Выполняется Post-запрос");
        Thread.sleep(2000);
        return new ResponseEntity<>("Post запрос отработал", HttpStatus.OK);
    }

    @GetMapping(path = "/")
    public ResponseEntity<String> get(HttpServletRequest request) throws ServletException, InterruptedException {
        System.out.println("Выполняется Get-запрос");
        Thread.sleep(2000);
        return new ResponseEntity<>("Get запрос отработал", HttpStatus.OK);
    }
}
