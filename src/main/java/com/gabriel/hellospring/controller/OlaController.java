package com.gabriel.hellospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


@RestController
public class OlaController {

    private String helloWorld = "Hello World";

    @GetMapping("/ola")
    public String ola(){
        return helloWorld;
    }
}
