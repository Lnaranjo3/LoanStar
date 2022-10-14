package com.loanstar.LoanStar.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String sayHello() {
        return "HELLO WORLD";
    }
}
