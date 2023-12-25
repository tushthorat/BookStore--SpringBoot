package com.bookStore.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class BookController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/book_register")
    public String book_resister(){
        return "book_rester";
    }

}
