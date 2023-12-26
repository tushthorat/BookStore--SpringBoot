package com.bookStore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public class BookController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/book_register")
    public String book_resister(){
        return "book_rester";
    }


    @GetMapping("/available_books")
    public ModelAndView getAllBook() {
        List<com.bookStore.entity.Book>list=service.getAllBook();
//		ModelAndView m=new ModelAndView();
//		m.setViewName("bookList");
//		m.addObject("book",list);
        return new ModelAndView("bookList","book",list);
    }


}
