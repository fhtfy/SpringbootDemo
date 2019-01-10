package com.fhtfy.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Value("${book.name}")
    private String name;
    @Value("${book.author}")
    private String author;

    @RequestMapping(value="/test")
    public String test(){
        return "SpringBoot";
    }

    @RequestMapping(value="/value")
    public String value(){
        return "This is a book,name is "+name+" and author is "+author;
    }
}
