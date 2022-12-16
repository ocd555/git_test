package com.example.git_test;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

 @GetMapping("/")
 public String helloworld() {
     return "To-do Application !!";
         }
        }
