package com.bookStore.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class BookController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

}
