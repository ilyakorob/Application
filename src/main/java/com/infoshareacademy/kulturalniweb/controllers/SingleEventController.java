package com.infoshareacademy.kulturalniweb.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class SingleEventController {


    @GetMapping("/")
    public String show(){

        return "page";
    }
}
