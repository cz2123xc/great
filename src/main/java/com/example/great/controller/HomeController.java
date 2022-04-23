package com.example.great.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @GetMapping("/api/home")
    public String home2() {
        return "aaaaaaaaaaaaaaa";
    }

//    @GetMapping("/home")
//    public String home3() {
//        return "aaaaaaaaaaaaaaa";
//    }
//
//    @GetMapping("/aa")
//    public String index2() {
//        return "bbbbbbbbbbbb";
//    }
//
//
//    @GetMapping("/")
//    public String index() {
//        return "bbbbbbbbbbbb";
//    }


}
