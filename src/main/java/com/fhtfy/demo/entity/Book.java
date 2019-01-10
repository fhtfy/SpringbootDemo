package com.fhtfy.demo.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "book")
public class Book {

    private String name;
    private String author;
}
