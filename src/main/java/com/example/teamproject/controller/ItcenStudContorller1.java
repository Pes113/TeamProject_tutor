package com.example.teamproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ItcenStudContorller1 {

    @GetMapping("/itcenstud1")
    public @ResponseBody String itcenstud1() {
        return "Hello, itcenstud1!!";
    }
    
}
